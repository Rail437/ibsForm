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
public class FundReportingPeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int givingOilAndGas;//111
    private int stoppedLastMonth;//112
    private int totalOperating;//113
    private int notGiveProductLastMonth;//114
    private int awaitingAfterDrilling;//115
    private int awaitingDrillingNow;//116
    private int entireOperationalFund;//117
    private int telemechanizedFund;//118
    private int givingWaterWell;//119
    private int injectionGivingWaterWell;//120
    private int currentGivingWaterWell;//121
    private int controlGivingWaterWell;//123
    private int absorbingWell;//124
    private int inConservationWell;//125
    private int inAwaitingLiquidationWell;//127
    private int liquidatedAfterOperationWell;//128
    private int liquidatedAfterDrillingWell;//129
    private int totalFundOfWell;//130
    private int AcceptedWellsFromDrilling;//131
    private int AcceptedFromGasFund;//132
    private int arrivedWell;//141
    private int droppedWell;//142
}
