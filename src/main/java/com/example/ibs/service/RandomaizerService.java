package com.example.ibs.service;

import com.example.ibs.enteties.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class RandomaizerService {

    /*public MainEntity getRandomMainEntity(){
        Random rand = new Random();
        MainEntity result = MainEntity.builder()
                .main_id(rand.nextLong())
                .organizationName("org")
                .address("test address")
                .okpo(rand.nextInt())
                .okud(rand.nextInt())
                .extractedNewWells(OilExtractedValue.getRandom())
                .extractedOldWells(OilExtractedValue.getRandom())
                .standartPump(OilExtractedValue.getRandom())
                .totalExtractedOil(OilExtractedValue.getRandom())
                .compressor(OilExtractedValue.getRandom())
                .electricPump(OilExtractedValue.getRandom())
                .explorationWell(OilExtractedValue.getRandom())
                .totalPumpExtracted(OilExtractedValue.getRandom())
                .extractedLastYearWells(OilExtractedValue.getRandom())
                .newWellsBalans(WellValue.getRandom())
                .totalWellsBalans(WellValue.getRandom())
                .commissioningOilWell(CommissioningWellValue.getRandom())
                .explorianOilWell(CommissioningWellValue.getRandom())
                .commissioningPumpWell(CommissioningWellValue.getRandom())
                .commissioningElectroPumpWell(CommissioningWellValue.getRandom())
                .commissioningCompressorWell(CommissioningWellValue.getRandom())
                .commissioningFountainPumpWell(CommissioningWellValue.getRandom())
                .commissioningInjectionPumpWell(CommissioningWellValue.getRandom())
                .commissioningInjectionPumpAfterOilWell(CommissioningWellValue.getRandom())
                .totalImpact(MethodsInfluence.getRandom())
                .impactWaterInjection(MethodsInfluence.getRandom())
                .impactHydrodynamicMethods(MethodsInfluence.getRandom())
                .impactNewMethods(MethodsInfluence.getRandom())
                .impactNewPhysicoChemicalMethods(MethodsInfluence.getRandom())
                .impactNewThermalMethods(MethodsInfluence.getRandom())
                .fundReportingPeriod(FundReportingPeriod.getRandom())
                .productionAssociateGas(ProductionAssociateGas.getRandom())
                .oilMovement(OilMovement.getRandom())
                .oilPreparation(OilPreparation.getRundom())
                .build();
        return result;
    }*/

    public MainEntity getRandomMainEntity(){
        Random rand = new Random();
        MainEntity result = MainEntity.builder()
                .main_id(rand.nextLong())
                .organizationName("org")
                .address("test address")
                .okpo(rand.nextInt())
                .okud(rand.nextInt())
                .standartPump(OilExtractedValue.getRandom())
                .electricPump(OilExtractedValue.getRandom())
                .compressor(OilExtractedValue.getRandom())
                .fountainPump(OilExtractedValue.getRandom())
                .otherPump(OilExtractedValue.getRandom())
                .totalPumpExtracted(OilExtractedValue.getRandom())
                .extractedOldWells(OilExtractedValue.getRandom())
                .extractedLastYearWells(OilExtractedValue.getRandom())
                .extractedNewWells(OilExtractedValue.getRandom())
                .randomOilProduction(OilExtractedValue.getRandom())
                .explorationWell(OilExtractedValue.getRandom())
                .totalExtractedOil(OilExtractedValue.getRandom())
                .totalWellsBalans(WellValue.getRandom())
                .newWellsBalans(WellValue.getRandom())
                .commissioningOilWell(CommissioningWellValue.getRandom())
                .explorianOilWell(CommissioningWellValue.getRandom())
                .commissioningPumpWell(CommissioningWellValue.getRandom())
                .commissioningElectroPumpWell(CommissioningWellValue.getRandom())
                .commissioningFountainPumpWell(CommissioningWellValue.getRandom())
                .commissioningInjectionPumpWell(CommissioningWellValue.getRandom())
                .commissioningCompressorWell(CommissioningWellValue.getRandom())
                .commissioningInjectionPumpAfterOilWell(CommissioningWellValue.getRandom())
                .totalImpact(MethodsInfluence.getRandom())
                .impactNewThermalMethods(MethodsInfluence.getRandom())
                .impactWaterInjection(MethodsInfluence.getRandom())
                .impactHydrodynamicMethods(MethodsInfluence.getRandom())
                .impactNewPhysicoChemicalMethods(MethodsInfluence.getRandom())
                .impactNewMethods(MethodsInfluence.getRandom())
                .fundReportingPeriod(FundReportingPeriod.getRandom())
                .productionAssociateGas(ProductionAssociateGas.getRandom())
                .oilMovement(OilMovement.getRandom())
                .oilPreparation(OilPreparation.getRundom())
                .official("official")
                .initials("R.I.P.")
                .phoneNumber(8900000000L)
                .email("Email")
                .date(50500505L)
                .build();
        return result;
    }

}
