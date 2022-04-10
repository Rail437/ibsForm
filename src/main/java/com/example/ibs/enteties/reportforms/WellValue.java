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
public class WellValue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //Календарное время эксплуа-
    //тационного фонда — всего (гр. 2 +5+7)
    private float exploatingFund ;

    //2
    private float operatingFundTotal;

    //3
    private float operatingFundExploit;

    //4
    private float operatingFundDowntime;

    //5
    private float withoutProductionTotal;

    //6
    private float withoutProductionLastYear;

    //7
    private float awaitingWellsTime;

}
