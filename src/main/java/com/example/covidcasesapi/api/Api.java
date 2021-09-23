package com.example.covidcasesapi.api;

import com.example.covidcasesapi.model.api.ApiData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Api {

    private static final String API_URL = "https://api.covid19api.com/country/germany";
    private final RestTemplate restTemplate = new RestTemplate();

    public ApiData[] getApiData(){

        ResponseEntity<ApiData[]> response = restTemplate.getForEntity(API_URL, ApiData[].class);
        return response.getBody();
    }
}
