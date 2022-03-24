package com.example.ibs.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundReportingPeriod {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int givingOilAndGas;
    private int stoppedLastMonth;
    private int totalOperating;
    private int notGiveProductLastMonth;
    private int awaitingAfterDrilling;
    private int awaitingDrillingNow;
    private int entireOperationalFund;
    private int telemechanizedFund;
    private int givingWaterWell;
    private int injectionGivingWaterWell;
    private int currentGivingWaterWell;
    private int controlGivingWaterWell;
    private int absorbingWell;
    private int inConservationWell;
    private int inAwaitingLiquidationWell;
    private int liquidatedAfterOperationWell;
    private int liquidatedAfterDrillingWell;

    private int arrivedWell;
    private int droppedWell;
}
