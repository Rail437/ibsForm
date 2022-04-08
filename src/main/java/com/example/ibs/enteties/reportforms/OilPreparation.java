package com.example.ibs.enteties.reportforms;

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

    private float liquidIntake;
    private float receivedOil;
    private float preparedOil;
    private float oilLosses;


}
