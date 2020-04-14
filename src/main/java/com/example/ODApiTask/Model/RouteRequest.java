package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RouteRequest {
    @JsonProperty("ResponseStatusCode")
    private String ResponseStatusCode;
    @JsonProperty("Routes")
    private List<Routes> Routes;

    public String getResponseStatusCode() {
        return ResponseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        ResponseStatusCode = responseStatusCode;
    }

    public List<Routes> getRoutes() {
        return Routes;
    }

    public void setRoutes(List<Routes> routes) {
        Routes = routes;
    }

    @Override
    public String toString() {
        return "RouteResponse{" +
                "ResponseStatusCode='" + ResponseStatusCode + '\'' +
                ", Routes=" + Routes +
                '}';
    }
}
