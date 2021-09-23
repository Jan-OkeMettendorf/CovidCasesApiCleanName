package com.example.covidcasesapi.Service;

import com.example.covidcasesapi.model.Cases;
import com.example.covidcasesapi.model.api.ApiData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Mapper {

    public List<Cases> mapToList(ApiData[] apiData){

        List<Cases> cases = new ArrayList<>();

        for (ApiData apiData1 : apiData) {
            Cases cases1 = new Cases(
                    apiData1.getDate(),
                    apiData1.getConfirmedCases()
            );
            cases.add(cases1);
        }
        return cases;
    }

}
