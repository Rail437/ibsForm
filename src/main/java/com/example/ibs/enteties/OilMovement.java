package com.example.ibs.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OilMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int remainsBeginning;
    private int extracted;
    private int received;
    private int total;
    private int expenditureOnNeeds;
    private int lossesTotal;
    private int passedTotal;
    private int oilGasFactory;
    private int gasFactory;
    private int handedOil;
    private int export;
    private int drilling;
    private int otherMineFactory;
    private int otherFactory;
    private int totalExpense;
    private int remainsEnd;
    private int remainsEndOilPipelinesAndTanks;
    private String transcriptAmountOil;
}
