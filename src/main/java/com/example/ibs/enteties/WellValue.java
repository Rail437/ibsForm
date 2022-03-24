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
public class WellValue {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //Календарное время эксплуа-
    //тационного фонда — всего (гр. 2 +5+7)
    private int exploatingFund ;

    //2
    private int operatingFundTotal;

    //3
    private int operatingFundExploit;

    //4
    private int operating_fund_downtime;

    //5
    private int without_production_total;

    //6
    private int without_production_last_year;

    //7
    private int awaitingWellsTime;

    public static WellValue getRandom(){
        Random random = new Random();

        return new WellValue(random.nextLong(),
                9,
                2,
                random.nextInt(),
                random.nextInt(),
                3,
                random.nextInt(),
                4);
    }
}
