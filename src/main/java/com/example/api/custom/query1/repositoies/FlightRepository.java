package com.example.api.custom.query1.repositoies;

import com.example.api.custom.query1.entities.Fligth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository <Fligth,Long>{
}
