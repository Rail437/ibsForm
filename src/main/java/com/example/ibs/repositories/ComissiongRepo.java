package com.example.ibs.repositories;

import com.example.ibs.enteties.reportforms.CommissioningWellValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComissiongRepo extends JpaRepository<CommissioningWellValue, Integer> {
}
