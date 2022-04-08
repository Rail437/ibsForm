package com.example.ibs.service.impl;

import com.example.ibs.enteties.reportforms.ReportEntity;
import com.example.ibs.repositories.MainRepo;
import com.example.ibs.service.ReportService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ReportServiceImpl implements ReportService {
    private final MainRepo mainRepo;

    public ReportServiceImpl(MainRepo mainRepo) {
        this.mainRepo = mainRepo;
    }

    @Override
    public ReportEntity saveEntity(ReportEntity reportEntity){
        return mainRepo.save(reportEntity);
    }

    @Override
    public ReportEntity getById(Long id){
        return mainRepo.findById(id).orElse(null);
    }
}
