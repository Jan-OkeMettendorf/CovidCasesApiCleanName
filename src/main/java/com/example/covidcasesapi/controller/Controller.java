package com.example.covidcasesapi.controller;

import com.example.covidcasesapi.Service.Service;
import com.example.covidcasesapi.model.Cases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cases")
public class Controller {

    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    public List<Cases> list(){
        return service.list();
    }
}
