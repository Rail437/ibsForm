package com.example.ibs.repositories;

import com.example.ibs.enteties.OilExtractedValue;
import com.example.ibs.enteties.OilMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OilMoveRepo extends JpaRepository<OilMovement, Integer> {
}
