package com.example.ODApiTask.Utils;

import com.example.ODApiTask.Model.CountriesRequest;
import com.example.ODApiTask.Model.OriginRequest;
import com.example.ODApiTask.Model.RegionRequest;
import com.example.ODApiTask.Model.RouteRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;

@Component
public class ODApiUtils {


    ObjectMapper ob = new ObjectMapper();
    File file = null;

    public OriginRequest readOriginsFile(String originsFile) throws IOException {
        file = ResourceUtils.getFile("classpath:" + originsFile);
        OriginRequest originRequest = ob.readValue(file, OriginRequest.class);
        return originRequest;
    }

    public CountriesRequest readCountriesFile(String countriesFile) throws IOException {
        file = ResourceUtils.getFile("classpath:" + countriesFile);
        CountriesRequest countriesRequest = ob.readValue(file, CountriesRequest.class);
        return countriesRequest;
    }

    public RegionRequest readRegionsFile(String regionsFile) throws IOException {
        file = ResourceUtils.getFile("classpath:" + regionsFile);
        RegionRequest regionRequest = ob.readValue(file, RegionRequest.class);
        return regionRequest;
    }

    public RouteRequest readRoutesFile(String routesFile) throws IOException {
        file = ResourceUtils.getFile("classpath:" + routesFile);
        RouteRequest routeRequest = ob.readValue(file, RouteRequest.class);
        return routeRequest;
    }
}
