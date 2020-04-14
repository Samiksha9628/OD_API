package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.LinkedHashMap;

public class Response {

    public LinkedHashMap<String, RouteResponse> getRouteResponse() {
        return routeResponse;
    }

    public void setRouteResponse(LinkedHashMap<String, RouteResponse> routeResponse) {
        this.routeResponse = routeResponse;
    }

    public LinkedHashMap<String, RegionResponse> getRegionResponse() {
        return regionResponse;
    }

    public void setRegionResponse(LinkedHashMap<String, RegionResponse> regionResponse) {
        this.regionResponse = regionResponse;
    }

    public LinkedHashMap<String, CountriesResponse> getCountriesResponse() {
        return countriesResponse;
    }

    public void setCountriesResponse(LinkedHashMap<String, CountriesResponse> countriesResponse) {
        this.countriesResponse = countriesResponse;
    }

    public LinkedHashMap<String, AirportResponse> getAirportResponse() {
        return airportResponse;
    }

    public void setAirportResponse(LinkedHashMap<String, AirportResponse> airportResponse) {
        this.airportResponse = airportResponse;
    }

    @JsonProperty("RouteResponse")
    private LinkedHashMap<String,RouteResponse> routeResponse;
    @JsonProperty("RegionRequest")
    private LinkedHashMap<String,RegionResponse> regionResponse;
    @JsonProperty("CountriesRequest")
    private LinkedHashMap<String,CountriesResponse> countriesResponse;
    @JsonProperty("Airports")
    private LinkedHashMap<String, AirportResponse> airportResponse;
    @JsonProperty("Source")
    private String Source;

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }



    @JsonProperty("TimeStamp")
    private Instant TimeStamp;

    public Instant getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        TimeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Response{" +
                "routeResponse=" + routeResponse +
                ", regionResponse=" + regionResponse +
                ", countriesResponse=" + countriesResponse +
                ", airportResponse=" + airportResponse +
                '}';
    }





}

