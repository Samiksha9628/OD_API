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
    private String responseStatusCode;
    @JsonProperty("Countries")
    private List<Countries> countries;

    public String getResponseStatusCode() {
        return responseStatusCode;
    }

    public void setResponseStatusCode(String responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    public List<Countries> getCountries() {
        return countries;
    }

    public void setCountries(List<Countries> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "CountriesRequest [responseStatusCode=" + responseStatusCode + ", countries=" + countries + "]";
    }
}
