package com.example.ibs.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Random;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MethodsInfluence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double impactFormation;
    private double increaseProduction;

    public static MethodsInfluence getRandom(){
        Random random = new Random();
        return new MethodsInfluence(
                random.nextInt(),
                random.nextInt(),
                random.nextInt()
        );
    }
}
