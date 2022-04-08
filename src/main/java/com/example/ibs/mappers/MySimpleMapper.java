package com.example.ibs.mappers;

import com.example.ibs.controllers.dtos.Message;
import com.example.ibs.controllers.dtos.ReportDto;
import com.example.ibs.enteties.reportforms.*;
import org.springframework.stereotype.Component;

@Component
public class MySimpleMapper {

    public ReportDto mapToDto(Message ms){
        ReportDto rD = ReportDto.builder()
                .id(ms.getId())
                .organizationName(ms.getOrganizationName())
                .address(ms.getAddress())
                .okud(ms.getOkud())
                .okpo(ms.getOkpo())
                .official(ms.getOfficial())
                .initials(ms.getInitials())
                .phoneNumber(ms.getPhoneNumber())
                .email(ms.getEmail())
                .date(ms.getDate())
                .username(ms.getUsername())
                .standartPump(new OilExtractedValue(0, ms.getField1_1(), ms.getField1_2(),ms.getField1_3(),ms.getField1_4(),ms.getField1_5(),ms.getField1_6()))
                .electricPump(new OilExtractedValue(0, ms.getField2_1(), ms.getField2_2(),ms.getField2_3(),ms.getField2_4(),ms.getField2_5(),ms.getField2_6()))
                .compressor(new OilExtractedValue(0, ms.getField3_1(), ms.getField3_2(),ms.getField3_3(),ms.getField3_4(),ms.getField3_5(),ms.getField3_6()))
                .fountainPump(new OilExtractedValue(0, ms.getField4_1(), ms.getField4_2(),ms.getField4_3(),ms.getField4_4(),ms.getField4_5(),ms.getField4_6()))
                .otherPump(new OilExtractedValue(0, ms.getField5_1(), ms.getField5_2(),ms.getField5_3(),ms.getField5_4(),ms.getField5_5(),ms.getField5_6()))
                .totalPumpExtracted(new OilExtractedValue(0, ms.getField6_1(), ms.getField6_2(),ms.getField6_3(),ms.getField6_4(),ms.getField6_5(),ms.getField6_6()))
                .extractedOldWells(new OilExtractedValue(0, ms.getField7_1(), ms.getField7_2(),ms.getField7_3(),ms.getField7_4(),ms.getField7_5(),ms.getField7_6()))
                .extractedLastYearWells(new OilExtractedValue(0, ms.getField8_1(), ms.getField8_2(),ms.getField8_3(),ms.getField8_4(),ms.getField8_5(),ms.getField8_6()))
                .extractedNewWells(new OilExtractedValue(0, ms.getField10_1(), ms.getField10_2(),ms.getField10_3(),ms.getField10_4(),ms.getField10_5(),ms.getField10_6()))
                .randomOilProduction(new OilExtractedValue(ms.getField11_1()))
                .explorationWell(new OilExtractedValue(ms.getField12_1()))
                .totalExtractedOil(new OilExtractedValue(ms.getField13_1()))
                .totalWellsBalans(new WellValue(0,ms.getField41_1(),ms.getField41_2(),ms.getField41_3(),ms.getField41_4(),ms.getField41_5(),ms.getField41_6(),ms.getField41_7()))
                .newWellsBalans(new WellValue(0,ms.getField42_1(),ms.getField42_2(),ms.getField42_3(),ms.getField42_4(),ms.getField42_5(),0,ms.getField42_7()))
                .commissioningOilWell(new CommissioningWellValue(0,ms.getField51_1(),ms.getField51_2(),ms.getField51_3(),ms.getField51_4(),ms.getField51_5()))
                .explorianOilWell(new CommissioningWellValue(0,ms.getField52_1(),0,0,0,0))
                .commissioningPumpWell(new CommissioningWellValue(0,ms.getField53_1(),ms.getField53_2(),ms.getField53_3(),ms.getField53_4(),ms.getField53_5()))
                .commissioningElectroPumpWell(new CommissioningWellValue(0,ms.getField54_1(),ms.getField54_2(),ms.getField54_3(),ms.getField54_4(),ms.getField54_5()))
                .commissioningCompressorWell(new CommissioningWellValue(0,ms.getField55_1(),ms.getField55_2(),ms.getField55_3(),ms.getField55_4(),ms.getField55_5()))
                .commissioningFountainPumpWell(new CommissioningWellValue(0,ms.getField56_1(),ms.getField56_2(),ms.getField56_3(),ms.getField56_4(),ms.getField56_5()))
                .commissioningInjectionPumpWell(new CommissioningWellValue(0,ms.getField57_1(),ms.getField57_2(),ms.getField57_3(),ms.getField57_4(),ms.getField57_5()))
                .commissioningInjectionPumpAfterOilWell(new CommissioningWellValue(ms.getField58_1()))
                .totalImpact(new MethodsInfluence(0,ms.getField61_1(),ms.getField61_2()))
                .impactWaterInjection(new MethodsInfluence(0,ms.getField62_1(),ms.getField62_2()))
                .impactHydrodynamicMethods(new MethodsInfluence(0,ms.getField63_1(),ms.getField63_2()))
                .impactNewMethods(new MethodsInfluence(0,ms.getField64_1(),ms.getField64_2()))
                .impactNewPhysicoChemicalMethods(new MethodsInfluence(0,ms.getField65_1(),ms.getField65_2()))
                .impactNewThermalMethods(new MethodsInfluence(0,ms.getField66_1(),ms.getField66_2()))
                .fundReportingPeriod(new FundReportingPeriod(
                        0,ms.getField111_1(),ms.getField112_1(),ms.getField113_1(),ms.getField114_1(),ms.getField115_1(),ms.getField116_1(),
                        ms.getField117_1(),ms.getField118_1(),ms.getField119_1(),ms.getField120_1(),ms.getField121_1(),ms.getField123_1(),
                        ms.getField124_1(),ms.getField125_1(),ms.getField127_1(),ms.getField128_1(),ms.getField129_1(),ms.getField130_1(),
                        ms.getField131_1(),ms.getField132_1(),ms.getField141_1(),ms.getField142_1()))
                .productionAssociateGas(new ProductionAssociateGas(0,ms.getField151_1(),ms.getField151_2(),ms.getField151_3(),ms.getField151_4()))
                .oilMovement(new OilMovement(0,
                        ms.getField161_1(),ms.getField162_1(),ms.getField163_1(),ms.getField166_1(),ms.getField167_1(),ms.getField168_1(),
                        ms.getField171_1(),ms.getField172_1(),ms.getField173_1(),ms.getField174_1(),ms.getField175_1(),ms.getField176_1(),
                        ms.getField177_1(),ms.getField178_1(),ms.getField179_1(),ms.getField180_1(),ms.getField181_1()))
                .oilPreparation(new OilPreparation(0,ms.getField182_1() ,ms.getField183_1(),ms.getField184_1(),ms.getField185_1()))
                .build();
        return rD;
    }

    public Message mapToMessage(ReportDto rd){
        Message ms = Message.builder()
                .id(rd.getId())
                .organizationName(rd.getOrganizationName())
                .address(rd.getAddress())
                .okud(rd.getOkud())
                .okpo(rd.getOkpo())
                .official(rd.getOfficial())
                .initials(rd.getInitials())
                .phoneNumber(rd.getPhoneNumber())
                .email(rd.getEmail())
                .date(rd.getDate())
                .username(rd.getUsername())
                .filial(rd.getFilial())
                .field1_1(rd.getStandartPump().getYearProduction()).field1_2(rd.getStandartPump().getCountedMounth()).field1_3(rd.getStandartPump().getUncountedMonth()).field1_4(rd.getStandartPump().getAverageDebit()).field1_5(rd.getStandartPump().getNumberOfWells()).field1_6(rd.getStandartPump().getExtractedFromWells())
                .field2_1(rd.getElectricPump().getYearProduction()).field2_2(rd.getElectricPump().getCountedMounth()).field2_3(rd.getElectricPump().getUncountedMonth()).field2_4(rd.getElectricPump().getAverageDebit()).field2_5(rd.getElectricPump().getNumberOfWells()).field2_6(rd.getElectricPump().getExtractedFromWells())
                .field3_1(rd.getCompressor().getYearProduction()).field3_2(rd.getCompressor().getCountedMounth()).field3_3(rd.getCompressor().getUncountedMonth()).field3_4(rd.getCompressor().getAverageDebit()).field3_5(rd.getCompressor().getNumberOfWells()).field3_6(rd.getCompressor().getExtractedFromWells())
                .field4_1(rd.getFountainPump().getYearProduction()).field4_2(rd.getFountainPump().getCountedMounth()).field4_3(rd.getFountainPump().getUncountedMonth()).field4_4(rd.getFountainPump().getAverageDebit()).field4_5(rd.getFountainPump().getNumberOfWells()).field4_6(rd.getFountainPump().getExtractedFromWells())
                .field5_1(rd.getOtherPump().getYearProduction()).field5_2(rd.getOtherPump().getCountedMounth()).field5_3(rd.getOtherPump().getUncountedMonth()).field5_4(rd.getOtherPump().getAverageDebit()).field5_5(rd.getOtherPump().getNumberOfWells()).field5_6(rd.getOtherPump().getExtractedFromWells())
                .field6_1(rd.getTotalPumpExtracted().getYearProduction()).field6_2(rd.getTotalPumpExtracted().getCountedMounth()).field6_3(rd.getTotalPumpExtracted().getUncountedMonth()).field6_4(rd.getTotalPumpExtracted().getAverageDebit()).field6_5(rd.getTotalPumpExtracted().getNumberOfWells()).field6_6(rd.getTotalPumpExtracted().getExtractedFromWells())
                .field7_1(rd.getExtractedOldWells().getYearProduction()).field7_2(rd.getExtractedOldWells().getCountedMounth()).field7_3(rd.getExtractedOldWells().getUncountedMonth()).field7_4(rd.getExtractedOldWells().getAverageDebit()).field7_5(rd.getExtractedOldWells().getNumberOfWells()).field7_6(rd.getExtractedOldWells().getExtractedFromWells())
                .field8_1(rd.getExtractedLastYearWells().getYearProduction()).field8_2(rd.getExtractedLastYearWells().getCountedMounth()).field8_3(rd.getExtractedLastYearWells().getUncountedMonth()).field8_4(rd.getExtractedLastYearWells().getAverageDebit()).field8_5(rd.getExtractedLastYearWells().getNumberOfWells()).field8_6(rd.getExtractedLastYearWells().getExtractedFromWells())
                .field10_1(rd.getExtractedNewWells().getYearProduction()).field10_2(rd.getExtractedNewWells().getCountedMounth()).field10_3(rd.getExtractedNewWells().getUncountedMonth()).field10_4(rd.getExtractedNewWells().getAverageDebit()).field10_5(rd.getExtractedNewWells().getNumberOfWells()).field10_6(rd.getExtractedNewWells().getExtractedFromWells())
                .field11_1(rd.getRandomOilProduction().getYearProduction())
                .field12_1(rd.getExplorationWell().getYearProduction())
                .field13_1(rd.getTotalExtractedOil().getYearProduction())

                .field41_1(rd.getTotalWellsBalans().getExploatingFund()).field41_2(rd.getTotalWellsBalans().getOperatingFundTotal()).field41_3(rd.getTotalWellsBalans().getOperatingFundExploit()).field41_4(rd.getTotalWellsBalans().getOperating_fund_downtime()).field41_5(rd.getTotalWellsBalans().getWithout_production_total()).field41_6(rd.getTotalWellsBalans().getWithout_production_last_year()).field41_7(rd.getTotalWellsBalans().getAwaitingWellsTime())
                .field42_1(rd.getNewWellsBalans().getExploatingFund()).field42_2(rd.getNewWellsBalans().getOperatingFundTotal()).field42_3(rd.getNewWellsBalans().getOperatingFundExploit()).field42_4(rd.getNewWellsBalans().getOperating_fund_downtime()).field42_5(rd.getNewWellsBalans().getWithout_production_total()).field42_7(rd.getNewWellsBalans().getAwaitingWellsTime())

                .field51_1(rd.getCommissioningOilWell().getTotalCommissioningNewWellValue()).field51_2(rd.getCommissioningOilWell().getAfterDrillingWellValue()).field51_3(rd.getCommissioningOilWell().getConservationWellValue()).field51_4(rd.getCommissioningOilWell().getOtherWellValue()).field51_5(rd.getCommissioningOilWell().getLastYearWellValue())
                .field52_1(rd.getCommissioningOilWell().getTotalCommissioningNewWellValue())
                .field53_1(rd.getCommissioningPumpWell().getTotalCommissioningNewWellValue()).field53_2(rd.getCommissioningPumpWell().getAfterDrillingWellValue()).field53_3(rd.getCommissioningPumpWell().getConservationWellValue()).field53_4(rd.getCommissioningPumpWell().getOtherWellValue()).field53_5(rd.getCommissioningPumpWell().getLastYearWellValue())
                .field54_1(rd.getCommissioningElectroPumpWell().getTotalCommissioningNewWellValue()).field54_2(rd.getCommissioningElectroPumpWell().getAfterDrillingWellValue()).field54_3(rd.getCommissioningElectroPumpWell().getConservationWellValue()).field54_4(rd.getCommissioningElectroPumpWell().getOtherWellValue()).field54_5(rd.getCommissioningElectroPumpWell().getLastYearWellValue())
                .field55_1(rd.getCommissioningCompressorWell().getTotalCommissioningNewWellValue()).field55_2(rd.getCommissioningCompressorWell().getAfterDrillingWellValue()).field55_3(rd.getCommissioningCompressorWell().getConservationWellValue()).field55_4(rd.getCommissioningCompressorWell().getOtherWellValue()).field55_5(rd.getCommissioningCompressorWell().getLastYearWellValue())
                .field56_1(rd.getCommissioningFountainPumpWell().getTotalCommissioningNewWellValue()).field56_2(rd.getCommissioningFountainPumpWell().getAfterDrillingWellValue()).field56_3(rd.getCommissioningFountainPumpWell().getConservationWellValue()).field56_4(rd.getCommissioningFountainPumpWell().getOtherWellValue()).field56_5(rd.getCommissioningFountainPumpWell().getLastYearWellValue())
                .field57_1(rd.getCommissioningInjectionPumpWell().getTotalCommissioningNewWellValue()).field57_2(rd.getCommissioningInjectionPumpWell().getAfterDrillingWellValue()).field57_3(rd.getCommissioningInjectionPumpWell().getConservationWellValue()).field57_4(rd.getCommissioningInjectionPumpWell().getOtherWellValue()).field57_5(rd.getCommissioningInjectionPumpWell().getLastYearWellValue())
                .field58_1(rd.getCommissioningInjectionPumpAfterOilWell().getTotalCommissioningNewWellValue())

                .field61_1(rd.getTotalImpact().getImpactFormation()).field61_2(rd.getTotalImpact().getIncreaseProduction())
                .field62_1(rd.getImpactWaterInjection().getImpactFormation()).field62_2(rd.getImpactWaterInjection().getIncreaseProduction())
                .field63_1(rd.getImpactHydrodynamicMethods().getImpactFormation()).field63_2(rd.getImpactHydrodynamicMethods().getIncreaseProduction())
                .field64_1(rd.getImpactNewMethods().getImpactFormation()).field64_2(rd.getImpactNewMethods().getIncreaseProduction())
                .field65_1(rd.getImpactNewPhysicoChemicalMethods().getImpactFormation()).field65_2(rd.getImpactNewPhysicoChemicalMethods().getIncreaseProduction())
                .field66_1(rd.getImpactNewThermalMethods().getImpactFormation()).field66_2(rd.getImpactNewThermalMethods().getIncreaseProduction())

                .field111_1(rd.getFundReportingPeriod().getGivingOilAndGas()).field112_1(rd.getFundReportingPeriod().getStoppedLastMonth()).field113_1(rd.getFundReportingPeriod().getTotalOperating())
                .field114_1(rd.getFundReportingPeriod().getNotGiveProductLastMonth()).field115_1(rd.getFundReportingPeriod().getAwaitingAfterDrilling()).field116_1(rd.getFundReportingPeriod().getAwaitingDrillingNow())
                .field117_1(rd.getFundReportingPeriod().getEntireOperationalFund()).field118_1(rd.getFundReportingPeriod().getTelemechanizedFund()).field119_1(rd.getFundReportingPeriod().getGivingWaterWell())
                .field120_1(rd.getFundReportingPeriod().getInjectionGivingWaterWell()).field121_1(rd.getFundReportingPeriod().getCurrentGivingWaterWell()).field123_1(rd.getFundReportingPeriod().getControlGivingWaterWell())
                .field124_1(rd.getFundReportingPeriod().getAbsorbingWell()).field125_1(rd.getFundReportingPeriod().getInConservationWell()).field127_1(rd.getFundReportingPeriod().getInAwaitingLiquidationWell())
                .field128_1(rd.getFundReportingPeriod().getLiquidatedAfterOperationWell()).field129_1(rd.getFundReportingPeriod().getLiquidatedAfterDrillingWell()).field130_1(rd.getFundReportingPeriod().getTotalFundOfWell())
                .field131_1(rd.getFundReportingPeriod().getAcceptedWellsFromDrilling()).field132_1(rd.getFundReportingPeriod().getAcceptedFromGasFund()).field141_1(rd.getFundReportingPeriod().getArrivedWell()).field142_1(rd.getFundReportingPeriod().getDroppedWell())

                .field151_1(rd.getProductionAssociateGas().getFactGasProduction()).field151_2(rd.getProductionAssociateGas().getConsumptionGas())
                .field151_3(rd.getProductionAssociateGas().getTechnologicalLosses()).field151_4(rd.getProductionAssociateGas().getBurnedGas())

                .field161_1(rd.getOilMovement().getRemainsBeginning()).field162_1(rd.getOilMovement().getExtracted()).field163_1(rd.getOilMovement().getReceived())
                .field166_1(rd.getOilMovement().getTotal()).field167_1(rd.getOilMovement().getExpenditureOnNeeds()).field168_1(rd.getOilMovement().getLossesTotal())
                .field171_1(rd.getOilMovement().getPassedTotal()).field172_1(rd.getOilMovement().getOilGasFactory()).field173_1(rd.getOilMovement().getGasFactory())
                .field174_1(rd.getOilMovement().getHandedOil()).field175_1(rd.getOilMovement().getExport()).field176_1(rd.getOilMovement().getDrilling())
                .field177_1(rd.getOilMovement().getOtherMineFactory()).field178_1(rd.getOilMovement().getOtherFactory()).field179_1(rd.getOilMovement().getTotalExpense())
                .field180_1(rd.getOilMovement().getRemainsEnd()).field181_1(rd.getOilMovement().getRemainsEndOilPipelinesAndTanks())

                .field182_1(rd.getOilPreparation().getLiquidIntake()).field183_1(rd.getOilPreparation().getReceivedOil())
                .field184_1(rd.getOilPreparation().getPreparedOil()).field185_1(rd.getOilPreparation().getOilLosses())

                .build();
        return ms;
    }

}
