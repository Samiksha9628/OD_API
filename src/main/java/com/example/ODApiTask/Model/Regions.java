package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Regions {

    @JsonProperty("RegionCode")
    private String RegionCode;
    @JsonProperty("RegionName")
    private String RegionName;
    @JsonProperty("RegionDescription")
    private String RegionDescription;
    @JsonProperty("ActiveFromDate")
    private String ActiveFromDate;
    @JsonProperty("ActiveToDate")
    private String ActiveToDate;
    @JsonProperty("CountryCodes")
    private List<String> CountryCodes;

    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    public String getRegionCode() {
        return this.RegionCode;
    }

    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public String getRegionName() {
        return this.RegionName;
    }

    public void setRegionDescription(String RegionDescription) {
        this.RegionDescription = RegionDescription;
    }

    public String getRegionDescription() {
        return this.RegionDescription;
    }

    @Override
    public String toString() {
        return "Regions{" +
                "RegionCode='" + RegionCode + '\'' +
                ", RegionName='" + RegionName + '\'' +
                ", RegionDescription='" + RegionDescription + '\'' +
                ", ActiveFromDate='" + ActiveFromDate + '\'' +
                ", ActiveToDate='" + ActiveToDate + '\'' +
                ", CountryCodes=" + CountryCodes +
                '}';
    }

    public void setActiveFromDate(String ActiveFromDate) {
        this.ActiveFromDate = ActiveFromDate;
    }

    public String getActiveFromDate() {
        return this.ActiveFromDate;
    }

    public void setActiveToDate(String ActiveToDate) {
        this.ActiveToDate = ActiveToDate;
    }

    public String getActiveToDate() {
        return this.ActiveToDate;
    }

    public void setCountryCodes(List<String> CountryCodes) {
        this.CountryCodes = CountryCodes;
    }

    public List<String> getCountryCodes() {
        return this.CountryCodes;
    }
}

