package com.example.ibs.repositories;

import com.example.ibs.enteties.OilExtractedValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OilExtrRepo extends JpaRepository<OilExtractedValue, Integer> {
}
