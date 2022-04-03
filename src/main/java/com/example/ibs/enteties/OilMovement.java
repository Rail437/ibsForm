package com.example.ibs.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OilMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double remainsBeginning;
    private double extracted;
    private double received;
    private double total;
    private double expenditureOnNeeds;
    private double lossesTotal;
    private double passedTotal;
    private double oilGasFactory;
    private double gasFactory;
    private double handedOil;
    private double export;
    private double drilling;
    private double otherMineFactory;
    private double otherFactory;
    private double totalExpense;
    private double remainsEnd;
    private double remainsEndOilPipelinesAndTanks;
    private String transcriptAmountOil;

    public static OilMovement getRandom(){
        Random random = new Random();
        return new OilMovement(
                random.nextInt(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                "test"
        );

    }
}
