package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RouteResponse {
    @JsonProperty("OriginCode")
    private String originCode;
    @JsonProperty("DestinationCodes")
    private List<String> destinationCodes;
    @JsonProperty("DestinationProperties")
    private List<DestinationProperties> destinationProperties;

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
    }

    public List<String> getDestinationCodes() {
        return destinationCodes;
    }

    public void setDestinationCodes(List<String> destinationCodes) {
        this.destinationCodes = destinationCodes;
    }

    public List<DestinationProperties> getDestinationProperties() {
        return destinationProperties;
    }

    public void setDestinationProperties(List<DestinationProperties> destinationProperties) {
        this.destinationProperties = destinationProperties;
    }
}
