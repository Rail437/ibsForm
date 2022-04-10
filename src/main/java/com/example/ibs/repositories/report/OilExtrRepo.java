package com.example.ibs.repositories.report;

import com.example.ibs.enteties.reportforms.OilExtractedValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OilExtrRepo extends JpaRepository<OilExtractedValue, Integer> {
}
