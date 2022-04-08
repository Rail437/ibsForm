package com.example.ibs.repositories;

import com.example.ibs.enteties.reportforms.OilMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OilMoveRepo extends JpaRepository<OilMovement, Integer> {
}
