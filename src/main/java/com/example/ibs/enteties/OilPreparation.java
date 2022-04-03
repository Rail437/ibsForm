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
public class OilPreparation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double liquidIntake;
    private double receivedOil;
    private double preparedOil;
    private double oilLosses;

    public static OilPreparation getRundom(){
        Random random = new Random();
        return new OilPreparation(
                random.nextInt(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble()
        );
    }
}
