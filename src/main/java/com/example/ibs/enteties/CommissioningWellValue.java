package com.example.ibs.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Random;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommissioningWellValue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int TotalCommissioningNewWellValue;
    private int AfterDrillingWellValue;
    private int ConservationWellValue;
    private int OtherWellValue;
    private int LastYearWellValue;


    public static CommissioningWellValue getRandom(){
        Random rand = new Random();
        return new CommissioningWellValue(
                rand.nextInt(),
                rand.nextInt(),
                rand.nextInt(),
                rand.nextInt(),
                rand.nextInt(),
                rand.nextInt());
    }
}
