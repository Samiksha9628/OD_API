package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Countries {

    @JsonProperty("CountryCode2")
    private String CountryCode2;
    @JsonProperty("CountryCode3")
    private String CountryCode3;
    @JsonProperty("CountryName")
    private String CountryName;
    @JsonProperty("CountryFullName")
    private String CountryFullName;
    @JsonProperty("CheckinAllowed")
    private boolean CheckinAllowed;
    @JsonProperty("ActiveFromDate")
    private String ActiveFromDate;
    @JsonProperty("ActiveToDate")
    private String ActiveToDate;
    @JsonProperty("RegionCodes")
    private List<String> RegionCodes;

    public String getCountryCode2() {
        return CountryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        CountryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return CountryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        CountryCode3 = countryCode3;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getCountryFullName() {
        return CountryFullName;
    }

    public void setCountryFullName(String countryFullName) {
        CountryFullName = countryFullName;
    }

    public boolean isCheckinAllowed() {
        return CheckinAllowed;
    }

    public void setCheckinAllowed(boolean checkinAllowed) {
        CheckinAllowed = checkinAllowed;
    }

    public String getActiveFromDate() {
        return ActiveFromDate;
    }

    public void setActiveFromDate(String activeFromDate) {
        ActiveFromDate = activeFromDate;
    }

    public String getActiveToDate() {
        return ActiveToDate;
    }

    public void setActiveToDate(String activeToDate) {
        ActiveToDate = activeToDate;
    }

    public List<String> getRegionCodes() {
        return RegionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        RegionCodes = regionCodes;
    }

    @Override
    public String toString() {
        return "Countries [CountryCode2=" + CountryCode2 + ", CountryCode3=" + CountryCode3 + ", CountryName="
                + CountryName + ", CountryFullName=" + CountryFullName + ", CheckinAllowed=" + CheckinAllowed
                + ", ActiveFromDate=" + ActiveFromDate + ", ActiveToDate=" + ActiveToDate + ", RegionCodes="
                + RegionCodes + "]";
    }
}


