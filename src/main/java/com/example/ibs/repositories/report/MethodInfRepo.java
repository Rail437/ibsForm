package com.example.ibs.repositories.report;

import com.example.ibs.enteties.reportforms.MethodsInfluence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MethodInfRepo extends JpaRepository<MethodsInfluence, Integer> {
}
