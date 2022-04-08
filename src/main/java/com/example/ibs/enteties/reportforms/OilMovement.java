package com.example.ibs.enteties.reportforms;

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

    private float remainsBeginning;//161
    private float extracted;//162
    private float received;//163
    private float total;//166
    private float expenditureOnNeeds;//167
    private float lossesTotal;//168
    private float passedTotal;//171
    private float oilGasFactory;//172
    private float gasFactory;//173
    private float handedOil;//174
    private float export;//175
    private float drilling;//176
    private float otherMineFactory;//177
    private float otherFactory;//178
    private float totalExpense;//179
    private float remainsEnd;//180
    private float remainsEndOilPipelinesAndTanks;//181

}
