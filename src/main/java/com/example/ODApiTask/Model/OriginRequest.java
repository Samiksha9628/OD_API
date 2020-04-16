package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OriginRequest {
    @JsonProperty("ResponseStatusCode")
    private String ResponseStatusCode;
    @JsonProperty("Airports")
    private List<Airports> Airports;

    public String getResponseStatusCode() {
        return ResponseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        ResponseStatusCode = responseStatusCode;
    }

    public List<Airports> getAirports() {
        return Airports;
    }

    public void setAirports(List<Airports> airports) {
        Airports = airports;
    }

    @Override
    public String toString() {
        return "OriginResponse{" +
                "ResponseStatusCode='" + ResponseStatusCode + '\'' +
                ", Airports=" + Airports +
                '}';
    }

}
