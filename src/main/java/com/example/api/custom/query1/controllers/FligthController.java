package com.example.api.custom.query1.controllers;

import com.example.api.custom.query1.services.FligthService;
import com.example.api.custom.query1.entities.Fligth;
import com.example.api.custom.query1.repositoies.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fligths")
public class FligthController {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    FligthService fligthService;

    @PostMapping
    public void createAll() {
       fligthService.createFlihts();
    }

    @GetMapping
    public List<Fligth> getAll(){
        List<Fligth> fligthList = flightRepository.findAll();
        return fligthList;
    }

}
