package com.example.ibs.enteties.reportforms;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OilExtractedValue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * Добыча нефти, тонн
     */
    //private String name;
    private double YearProduction;
    private double CountedMounth;
    private double UncountedMonth;
    private double AverageDebit;
    private double NumberOfWells;
    private double ExtractedFromWells;

    public OilExtractedValue(double yearProduction) {
        YearProduction = yearProduction;
    }
}
