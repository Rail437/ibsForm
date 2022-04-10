package com.example.ibs.controllers.dtos;


import com.example.ibs.enteties.reportforms.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportDto {

    private Long id;
    private String organizationName;
    private String address;
    private int okud;
    private int okpo;
    private String official;
    private String initials;
    private Long phoneNumber;
    private String email;
    private Long date;
    private String username;
    private int filial;

    //Раздел 1. Добыча нефти, тонн
    @JsonProperty("standartPump")
    private OilExtractedValue standartPump;

    private OilExtractedValue electricPump;

    private OilExtractedValue compressor;

    private OilExtractedValue fountainPump;

    private OilExtractedValue otherPump;

    private OilExtractedValue totalPumpExtracted;

    private OilExtractedValue extractedOldWells;

    private OilExtractedValue extractedLastYearWells;

    private OilExtractedValue extractedNewWells;

    private OilExtractedValue randomOilProduction;

    private OilExtractedValue explorationWell;

    private OilExtractedValue totalExtractedOil;

    //Раздел 2. Баланс календарного времени фонда нефтяных скважин, часов
    private WellValue totalWellsBalans; //41

    private WellValue newWellsBalans; //42

    //Раздел 3. Ввод в действие скважин, единиц
    private CommissioningWellValue commissioningOilWell;

    private CommissioningWellValue explorianOilWell;

    private CommissioningWellValue commissioningPumpWell;

    private CommissioningWellValue commissioningElectroPumpWell;

    private CommissioningWellValue commissioningCompressorWell;

    private CommissioningWellValue commissioningFountainPumpWell;

    private CommissioningWellValue commissioningInjectionPumpWell;

    private CommissioningWellValue commissioningInjectionPumpAfterOilWell;

    //Раздел 4. Добыча нефти из пластов, разрабатываемых с применением
    //методов искусственного воздействия на пласт, тонн
    private MethodsInfluence totalImpact;

    private MethodsInfluence impactWaterInjection;

    private MethodsInfluence impactHydrodynamicMethods;

    private MethodsInfluence impactNewMethods;

    private MethodsInfluence impactNewPhysicoChemicalMethods;

    private MethodsInfluence impactNewThermalMethods;

    //Раздел 5. Фонд скважин на конец отчетного периода, единиц
    private FundReportingPeriod fundReportingPeriod;

    //Раздел 6. Добыча нефтяного (попутного) газа, тысяч кубических метров
    private ProductionAssociateGas productionAssociateGas;

    //Раздел 7. Движение нефти (включая газовый конденсат) с начала года, тонн
    private OilMovement oilMovement;

    //Раздел 8. Подготовка нефти (включая газовый конденсат), тонн
    private OilPreparation oilPreparation;


}
