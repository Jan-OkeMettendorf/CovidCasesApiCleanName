package com.example.covidcasesapi.model;

public class Cases {

    private String date;
    private long confirmedCases;

    public Cases(String date, long confirmedCases) {
        this.date = date;
        this.confirmedCases = confirmedCases;
    }

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
