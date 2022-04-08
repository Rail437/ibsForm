package com.example.ibs.repositories;

import com.example.ibs.enteties.reportforms.OilPreparation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OilPrepRepo extends JpaRepository<OilPreparation, Integer> {
}
