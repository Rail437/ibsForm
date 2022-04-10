package com.example.ibs.service;

import com.example.ibs.enteties.reportforms.ReportEntity;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    ReportEntity saveEntity(ReportEntity reportEntity);
    ReportEntity editEntity(ReportEntity reportEntity);
    ReportEntity getById(Long id);
    List<ReportEntity> findAllReports();
    Page<ReportEntity> findPageReports(int page, int countPerPage);
    void deleteById(Long id);
}
