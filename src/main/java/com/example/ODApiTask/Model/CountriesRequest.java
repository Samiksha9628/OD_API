package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource(value = "classpath:countries.json")
@ConfigurationProperties
public class CountriesRequest {
    @JsonProperty("ResponseStatusCode")
    private String ResponseStatusCode;
    @JsonProperty("Countries")
    private List<Countries> Countries;


    public String getResponseStatusCode() {
        return ResponseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        ResponseStatusCode = responseStatusCode;
    }

    public List<Countries> getCountries() {
        return Countries;
    }

    public void setCountries(List<Countries> countries) {
        Countries = countries;
    }

    @Override
    public String toString() {
        return "CountriesResponse{" +
                "ResponseStatusCode='" + ResponseStatusCode + '\'' +
                ", Countries=" + Countries +
                '}';
    }
}
