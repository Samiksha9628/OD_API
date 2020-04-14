package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CountriesResponse {

    @JsonProperty("Code")
    private String Code;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("RegionCodes")
    private List<String> RegionCodes;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getRegionCodes() {
        return RegionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        RegionCodes = regionCodes;
    }

    @Override
    public String toString() {
        return "CountriesResponse{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", RegionCodes=" + RegionCodes +
                '}';
    }

}
