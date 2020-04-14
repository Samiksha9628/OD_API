package com.example.ODApiTask.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationProperties extends RouteResponse {
    @JsonProperty("i")
    private int i;
    @JsonProperty("c")
    private int c;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "DestinationProperties{" +
                "i=" + i +
                ", c=" + c +
                '}';
    }

}
