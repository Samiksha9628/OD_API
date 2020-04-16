package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RouteRequest {
    @JsonProperty("ResponseStatusCode")
    private String responseStatusCode;
    @JsonProperty("Routes")
    private List<Routes> routes;

    public String getResponseStatusCode() {
        return responseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    public List<Routes> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Routes> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "RoutesRequest [responseStatusCode=" + responseStatusCode + ", routes=" + routes + "]";
    }
}
