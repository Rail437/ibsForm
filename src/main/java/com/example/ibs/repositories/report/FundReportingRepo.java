package com.example.ibs.repositories.report;

import com.example.ibs.enteties.reportforms.FundReportingPeriod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundReportingRepo extends JpaRepository<FundReportingPeriod, Integer> {
}
