package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RegionRequest {

    @JsonProperty("ResponseStatusCode")
    private String ResponseStatusCode;
    @JsonProperty("Regions")
    private List<Regions> Regions;

    public String getResponseStatusCode() {
        return ResponseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        ResponseStatusCode = responseStatusCode;
    }

    public List<Regions> getRegions() {
        return Regions;
    }

    public void setRegions(List<Regions> regions) {
        Regions = regions;
    }

    @Override
    public String toString() {
        return "RegionResponse{" +
                "ResponseStatusCode='" + ResponseStatusCode + '\'' +
                ", Regions=" + Regions +
                '}';
    }
}
