package com.example.ibs.service;

import com.example.ibs.enteties.reportforms.ReportEntity;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class RandomaizerService {

    public ReportEntity getRandomMainEntity(){
        ReportEntity result = new ReportEntity();
                /*.main_id(rand.nextLong())
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
                .date(50500505L)*/
                //.build();
        return result;
    }

}
