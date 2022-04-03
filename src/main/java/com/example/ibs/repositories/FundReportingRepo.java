package com.example.ibs.repositories;

import com.example.ibs.enteties.FundReportingPeriod;
import com.example.ibs.enteties.MethodsInfluence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundReportingRepo extends JpaRepository<FundReportingPeriod, Integer> {
}
