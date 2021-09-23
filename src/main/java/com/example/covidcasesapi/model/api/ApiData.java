package com.example.covidcasesapi.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiData {

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Confirmed")
    private long confirmedCases;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getConfirmedCases() {
        return confirmedCases;
    }

    public void setConfirmedCases(long confirmedCases) {
        this.confirmedCases = confirmedCases;
    }
}
