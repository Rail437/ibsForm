package com.example.ibs.repositories;

import com.example.ibs.enteties.reportforms.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepo extends JpaRepository<ReportEntity, Long> {

}
