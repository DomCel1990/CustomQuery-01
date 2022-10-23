package com.example.api.custom.query1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Fligth {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String fromAirport;
    private String toAirport;
    private String status;


    public Fligth(String description, String fromAirport, String toAirport, String status) {
        this.description=description;
        this.fromAirport=fromAirport;
        this.toAirport=toAirport;
        this.status=status;
    }
}
