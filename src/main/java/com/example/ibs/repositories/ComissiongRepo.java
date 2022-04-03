package com.example.ibs.repositories;

import com.example.ibs.enteties.CommissioningWellValue;
import com.example.ibs.enteties.WellValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComissiongRepo extends JpaRepository<CommissioningWellValue, Integer> {
}
