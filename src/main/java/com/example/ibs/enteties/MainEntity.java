package com.example.ibs.enteties;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long main_id;
    private String organizationName;
    private String address;
    private int okud;
    private int okpo;

    //Раздел 1. Добыча нефти, тонн
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "standart_pump_id")
    private OilExtractedValue standartPump;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "electric_pump_id")
    private OilExtractedValue electricPump;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "compressor_id")
    private OilExtractedValue compressor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fountain_pump_id")
    private OilExtractedValue fountainPump;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "other_pump_id")
    private OilExtractedValue otherPump;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "total_pump_extracted_id")
    private OilExtractedValue totalPumpExtracted;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "extracted_old_wells_id")
    private OilExtractedValue extractedOldWells;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "extracted_last_year_wells_id")
    private OilExtractedValue extractedLastYearWells;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "extracted_new_wells_id")
    private OilExtractedValue extractedNewWells;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "random_oil_production_id")
    private OilExtractedValue randomOilProduction;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exploration_well_id")
    private OilExtractedValue explorationWell;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "total_extracted_oil_id")
    private OilExtractedValue totalExtractedOil;

    //Раздел 2. Баланс календарного времени фонда нефтяных скважин, часов
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "total_wells_balans_id")
    private WellValue totalWellsBalans;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "new_wells_balans_id")
    private WellValue newWellsBalans;

    //Раздел 3. Ввод в действие скважин, единиц
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commissioning_oil_well_id")
    private CommissioningWellValue commissioningOilWell;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "explorian_oil_well_id")
    private CommissioningWellValue explorianOilWell;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commissioning_pump_well_id")
    private CommissioningWellValue commissioningPumpWell;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commissioning_electro_pump_well_id")
    private CommissioningWellValue commissioningElectroPumpWell;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commissioning_compressor_well_id")
    private CommissioningWellValue commissioningCompressorWell;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commissioning_fountain_pump_well_id")
    private CommissioningWellValue commissioningFountainPumpWell;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commissioning_injection_pump_well_id")
    private CommissioningWellValue commissioningInjectionPumpWell;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commissioning_injection_pump_after_oil_well_id")
    private CommissioningWellValue commissioningInjectionPumpAfterOilWell;

    //Раздел 4. Добыча нефти из пластов, разрабатываемых с применением
    //методов искусственного воздействия на пласт, тонн
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "total_impact_id")
    private MethodsInfluence totalImpact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "impact_water_injection_id")
    private MethodsInfluence impactWaterInjection;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "impact_hydrodynamic_methods_id")
    private MethodsInfluence impactHydrodynamicMethods;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "impact_new_methods_id")
    private MethodsInfluence impactNewMethods;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "impact_new_physico_chemical_methods_id")
    private MethodsInfluence impactNewPhysicoChemicalMethods;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "impact_new_thermal_methods_id")
    private MethodsInfluence impactNewThermalMethods;

    //Раздел 5. Фонд скважин на конец отчетного периода, единиц
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fund_reporting_period_id")
    private FundReportingPeriod fundReportingPeriod;

    //Раздел 6. Добыча нефтяного (попутного) газа, тысяч кубических метров
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "production_associate_gas_id")
    private ProductionAssociateGas productionAssociateGas;

    //Раздел 7. Движение нефти (включая газовый конденсат) с начала года, тонн
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oil_movement_id")
    private OilMovement oilMovement;

    //Раздел 8. Подготовка нефти (включая газовый конденсат), тонн
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oil_preparation_id")
    private OilPreparation oilPreparation;

    private String official;
    private String initials;
    private Long phoneNumber;
    private String email;
    private Long date;
}
