package com.example.ibs.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductionAssociateGas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double factGasProduction;
    private double consumptionGas;
    private double technologicalLosses;
    private double burnedGas;

    public static ProductionAssociateGas getRandom(){
        Random random = new Random();
        return new ProductionAssociateGas(
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt());
    }
}
