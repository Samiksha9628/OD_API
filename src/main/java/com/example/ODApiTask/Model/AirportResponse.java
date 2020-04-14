package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AirportResponse {

    @JsonProperty("Code")
    private String Code;
    @JsonProperty("City")
    private String City;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("DefaultDisplayName")
    private String DefaultDisplayName;
    @JsonProperty("StateCode")
    private String StateCode;
    @JsonProperty("CountryCode")
    private String CountryCode;
    @JsonProperty("CountryName")
    private String CountryName;
    @JsonProperty("IsBlueCity")
    private boolean IsBlueCity;
    @JsonProperty("IsPreClearedStation")
    private boolean IsPreClearedStation;
    @JsonProperty("IsMACCode")
    private boolean IsMACCode;
    @JsonProperty("ParentMACCode")
    private String ParentMACCode;
    @JsonProperty("ChildrenMACCodes")
    private String ChildrenMACCodes;
    @JsonProperty("RegionCodes")
    private List<String> RegionCodes;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDefaultDisplayName() {
        return DefaultDisplayName;
    }

    public void setDefaultDisplayName(String defaultDisplayName) {
        DefaultDisplayName = defaultDisplayName;
    }

    public String getStateCode() {
        return StateCode;
    }

    public void setStateCode(String stateCode) {
        StateCode = stateCode;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public boolean BlueCity() {
        return IsBlueCity;
    }

    public void setBlueCity(boolean blueCity) {
        IsBlueCity = blueCity;
    }

    public boolean isPreClearedStation() {
        return IsPreClearedStation;
    }

    public void setPreClearedStation(boolean preClearedStation) {
        IsPreClearedStation = preClearedStation;
    }

    public boolean isMACCode() {
        return IsMACCode;
    }

    public void setMACCode(boolean MACCode) {
        IsMACCode = MACCode;
    }

    public String getParentMACCode() {
        return ParentMACCode;
    }

    public void setParentMACCode(String parentMACCode) {
        ParentMACCode = parentMACCode;
    }

    public String getChildrenMACCodes() {
        return ChildrenMACCodes;
    }

    public void setChildrenMACCodes(String childrenMACCodes) {
        ChildrenMACCodes = childrenMACCodes;
    }

    public List<String> getRegionCodes() {
        return RegionCodes;
    }

    public void setRegionCodes(List<String> regionCodes) {
        this.RegionCodes = RegionCodes;
    }

    @Override
    public String toString() {
        return "AirportResponse{" +
                "Code='" + Code + '\'' +
                ", City='" + City + '\'' +
                ", Name='" + Name + '\'' +
                ", DefaultDisplayName='" + DefaultDisplayName + '\'' +
                ", StateCode='" + StateCode + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", CountryName='" + CountryName + '\'' +
                ", IsBlueCity=" + IsBlueCity +
                ", IsPreClearedStation=" + IsPreClearedStation +
                ", IsMACCode=" + IsMACCode +
                ", ParentMACCode='" + ParentMACCode + '\'' +
                ", ChildrenMACCodes='" + ChildrenMACCodes + '\'' +
                ", RegionCodes=" + RegionCodes +
                '}';
    }


}
