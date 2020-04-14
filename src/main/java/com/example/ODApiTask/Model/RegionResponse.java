package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegionResponse {
    @JsonProperty("Code")
    private String Code;
    @JsonProperty("Name")
    private String Name;

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

    @Override
    public String toString() {
        return "RegionResponse{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
