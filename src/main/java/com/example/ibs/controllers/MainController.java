package com.example.ibs.controllers;

import com.example.ibs.enteties.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainController {

    @GetMapping("/test")
    public MainEntity letsTest(){
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
                .build();
        return result;
    }
}
