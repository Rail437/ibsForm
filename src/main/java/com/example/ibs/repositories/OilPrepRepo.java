package com.example.ibs.repositories;

import com.example.ibs.enteties.OilMovement;
import com.example.ibs.enteties.OilPreparation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OilPrepRepo extends JpaRepository<OilPreparation, Integer> {
}
