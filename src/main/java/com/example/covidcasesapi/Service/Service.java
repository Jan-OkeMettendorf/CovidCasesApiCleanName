package com.example.covidcasesapi.Service;

import com.example.covidcasesapi.api.Api;
import com.example.covidcasesapi.model.Cases;
import com.example.covidcasesapi.model.api.ApiData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private final Api api;
    private final Mapper mapper;

    @Autowired
    public Service(Api api, Mapper mapper) {
        this.api = api;
        this.mapper = mapper;
    }

    public List<Cases> list(){

        ApiData[] apiData = api.getApiData();
        List<Cases> cases = mapper.mapToList(apiData);
        return cases;
    }
}
