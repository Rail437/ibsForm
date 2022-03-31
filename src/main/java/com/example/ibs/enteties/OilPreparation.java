package com.example.ibs.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OilPreparation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double liquidIntake;
    private double receivedOil;
    private double preparedOil;
    private double oilLosses;
}
