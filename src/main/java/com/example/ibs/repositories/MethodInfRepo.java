package com.example.ibs.repositories;

import com.example.ibs.enteties.MethodsInfluence;
import com.example.ibs.enteties.WellValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MethodInfRepo extends JpaRepository<MethodsInfluence, Integer> {
}
