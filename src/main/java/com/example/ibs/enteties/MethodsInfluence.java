package com.example.ibs.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Random;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MethodsInfluence {
    @Id
    @Column(name = "id", nullable = false)
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
