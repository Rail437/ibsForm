package com.example.ibs.repositories.report;

import com.example.ibs.enteties.reportforms.WellValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WellRepo extends JpaRepository<WellValue, Integer> {
}
