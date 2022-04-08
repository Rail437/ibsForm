package com.example.ibs.service;

import com.example.ibs.enteties.reportforms.ReportEntity;
import org.springframework.stereotype.Service;

@Service
public interface ReportService {
    ReportEntity saveEntity(ReportEntity reportEntity);
    ReportEntity getById(Long id);
}
