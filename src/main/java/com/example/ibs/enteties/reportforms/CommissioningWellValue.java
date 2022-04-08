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

    public CommissioningWellValue(int totalCommissioningNewWellValue) {
        TotalCommissioningNewWellValue = totalCommissioningNewWellValue;
    }
}
