package com.example.api.custom.query1.services;

import com.example.api.custom.query1.entities.Fligth;
import com.example.api.custom.query1.entities.Status;
import com.example.api.custom.query1.repositoies.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.Random;

@Service
public class FligthService {

    @Autowired
    FlightRepository flightRepository;

    public void createFlihts() {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            String generatedString = random.ints(10, 97, 122)
                    //StringBuilder::new create an empty object String builder
                    //StringBuilder::appendCodePoint used to append the string representation of the codePoint argument to this sequence
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            Fligth fligth = new Fligth(generatedString, generatedString, generatedString, Status.ONTIME.toString());
            flightRepository.save(fligth);
        }
    }
}

