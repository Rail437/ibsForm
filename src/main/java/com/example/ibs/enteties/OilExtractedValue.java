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
public class OilExtractedValue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //private String name;
    private double YearProduction;
    private double CountedMounth;
    private double UncountedMonth;
    private double AverageDebit;
    private double NumberOfWells;
    private double ExtractedFromWells;


    public static OilExtractedValue getRandom(){
        Random random = new Random();
        return new OilExtractedValue(
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt());
    }
}
