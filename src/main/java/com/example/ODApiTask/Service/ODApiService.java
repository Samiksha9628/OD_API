package com.example.ODApiTask.Service;

import com.example.ODApiTask.Model.*;
import com.example.ODApiTask.Utils.ODApiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class ODApiService {

    @Autowired
    ODApiUtils odApiUtils;

    @Value("${originsfile.location}")
    private String originsFile;

    @Value("${regionsfile.location}")
    private String regionsFile;

    @Value("${countriesfile.location}")
    private String countriesFile;

    @Value("${routesfile.location}")
    private String routesFile;


    Response response = new Response();

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    Instant instant = timestamp.toInstant();

    public LinkedHashMap<String, AirportResponse> getOriginsData() throws IOException {
        List<Airports> airportsList = odApiUtils.readOriginsFile(originsFile).getAirports();
        List<Countries> countriesList = odApiUtils.readCountriesFile(countriesFile).getCountries();
        AirportResponse airportResponse = null;
        LinkedHashMap<String, AirportResponse> airportMap = new LinkedHashMap<>();
        Map<String, List<String>> metroMap = airportsList.stream()
                .filter(airport -> airport.getMetropolitanAreaCode() != null)
                .collect(Collectors.groupingBy(Airports::getMetropolitanAreaCode,
                        Collectors.mapping(Airports::getIATAAirportCode,
                                Collectors.toList())));
        for (Airports airport : airportsList) {
            airportResponse = new AirportResponse();
            airportResponse.setCode(airport.getIATAAirportCode());
            airportResponse.setCity(airport.getCityName());
            airportResponse.setName(airport.getIATAAirportName());
            airportResponse.setDefaultDisplayName(airport.getAirportShortDisplayName());
            airportResponse.setStateCode(airport.getStateCode());
            airportResponse.setCountryCode(airport.getCountryCode2());
            airportResponse.setCountryName(
                    countriesList.stream().filter(a -> a.getCountryCode2().equalsIgnoreCase(airport.getCountryCode2()))
                            .findAny().get().getCountryName());
            airportResponse.setBlueCity(airport.isIsJetBlue());
            airportResponse.setPreClearedStation(airport.isIsPreClearedDestination());
            airportResponse.setParentMACCode(airport.getMetropolitanAreaCode());
            airportResponse.setChildrenMACCodes(metroMap.get(airport.getMetropolitanAreaCode()));
            airportResponse.setMACCode(airportResponse.getChildrenMACCodes() == null ? false : true);
            airportResponse.setRegionCodes(
                    countriesList.stream().filter(a -> a.getCountryCode2().equalsIgnoreCase(airport.getCountryCode2()))
                            .findAny().get().getRegionCodes());
            airportMap.put(airportResponse.getCode(), airportResponse);
        }

        return airportMap;
    }

    public LinkedHashMap<String, CountriesResponse> getCountriesData() throws IOException {

        List<Countries> countriesList = odApiUtils.readCountriesFile(countriesFile).getCountries();
        CountriesResponse countriesResponse = null;
        LinkedHashMap<String, CountriesResponse> countriesMap = new LinkedHashMap<>();
        for (Countries countries : countriesList) {
            countriesResponse = new CountriesResponse();
            countriesResponse.setCode(countries.getCountryCode2());
            countriesResponse.setName(countries.getCountryName());
            countriesResponse.setRegionCodes(countries.getRegionCodes());
            countriesMap.put(countriesResponse.getCode(), countriesResponse);

        }
        return countriesMap;
    }

    public LinkedHashMap<String, RegionResponse> getRegionsData() throws IOException {
        List<Regions> regionsList = odApiUtils.readRegionsFile(regionsFile).getRegions();
        RegionResponse regionResponse = null;
        LinkedHashMap<String, RegionResponse> regionsMap = new LinkedHashMap<>();
        for (Regions regions : regionsList) {
            regionResponse = new RegionResponse();
            regionResponse.setCode(regions.getRegionCode());
            regionResponse.setName(regions.getRegionName());
            regionsMap.put(regionResponse.getCode(), regionResponse);
        }

        return regionsMap;
    }

    public LinkedHashMap<String, RouteResponse> getRoutesData() throws IOException {

        List<Routes> routesList = odApiUtils.readRoutesFile(routesFile).getRoutes();
        RouteResponse routeResponse = null;
        LinkedHashMap<String, RouteResponse> routesMap = new LinkedHashMap<>();

        LinkedHashMap<String, DestinationProperties> destinationMap = new LinkedHashMap<>();
        for (Routes routes : routesList) {
            DestinationProperties destinationProperties = new DestinationProperties();
            destinationProperties.setI(routes.isIsInterline() ? 1 : 0);
            destinationProperties.setC(routes.isIsCodeShare() ? 1 : 0);
            destinationMap.put(routes.getDestinationAirportCode(), destinationProperties);
        }
        Map<String, List<String>> destinationCode = routesList.stream()
                .collect(Collectors.groupingBy(Routes::getOriginAirportCode,
                        Collectors.mapping(Routes::getDestinationAirportCode, Collectors.toList())));
        for (Routes routes : routesList) {
            routeResponse = new RouteResponse();
            routeResponse.setOriginCode(routes.getOriginAirportCode());
            routeResponse.setDestinationCodes(destinationCode.get(routes.getOriginAirportCode()));
            routeResponse.setDestinationProperties(routeResponse.getDestinationCodes().stream()
                    .map(dcode -> destinationMap.get(dcode)).collect(Collectors.toList()));
            routesMap.put(routeResponse.getOriginCode(), routeResponse);

        }


        return routesMap;
    }

    public Response getResponseData() throws IOException {
        response.setAirportResponse(getOriginsData());
        response.setCountriesResponse(getCountriesData());
        response.setRegionResponse(getRegionsData());
        response.setRouteResponse(getRoutesData());
        response.setSource("New");
        response.setTimeStamp(instant);

        return response;

    }

}
