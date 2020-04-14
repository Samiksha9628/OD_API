package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RouteResponse {
    @JsonProperty("OriginCode")
    private String OriginCode;
    @JsonProperty("DestinationCodes")
    private List<String> DestinationCodes;
    @JsonProperty("DestinationProperties")
    private List<RouteResponse> DestinationProperties;

    @Override
    public String toString() {
        return "RouteResponse{" +
                "OriginCode='" + OriginCode + '\'' +
                ", DestinationCodes=" + DestinationCodes +
                ", DestinationProperties=" + DestinationProperties +
                '}';
    }

    public String getOriginCode() {
        return OriginCode;
    }

    public void setOriginCode(String originCode) {
        OriginCode = originCode;
    }

    public List<String> getDestinationCodes() {
        return DestinationCodes;
    }

    public void setDestinationCodes(List<String> destinationCodes) {
        DestinationCodes = destinationCodes;
    }

    public List<RouteResponse> getDestinationProperties() {
        return DestinationProperties;
    }

    public void setDestinationProperties(List<RouteResponse> destinationProperties) {
        DestinationProperties = destinationProperties;
    }
}
