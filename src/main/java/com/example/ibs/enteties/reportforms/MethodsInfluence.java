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
public class MethodsInfluence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double impactFormation;
    private double increaseProduction;

}
