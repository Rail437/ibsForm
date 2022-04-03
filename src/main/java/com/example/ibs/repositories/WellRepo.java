package com.example.ibs.repositories;

import com.example.ibs.enteties.OilPreparation;
import com.example.ibs.enteties.WellValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WellRepo extends JpaRepository<WellValue, Integer> {
}
