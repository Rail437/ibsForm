package com.example.ibs.repositories.report;

import com.example.ibs.enteties.reportforms.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends JpaRepository<ReportEntity, Long> {

}
