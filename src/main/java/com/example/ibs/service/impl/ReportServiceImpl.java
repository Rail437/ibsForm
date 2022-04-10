package com.example.ibs.service.impl;

import com.example.ibs.enteties.reportforms.ReportEntity;
import com.example.ibs.repositories.report.ReportRepo;
import com.example.ibs.service.ReportService;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
public class ReportServiceImpl implements ReportService {
    private final ReportRepo reportRepo;

    public ReportServiceImpl(ReportRepo reportRepo) {
        this.reportRepo = reportRepo;
    }

    @Override
    public ReportEntity saveEntity(ReportEntity reportEntity){
        reportEntity.setId(null);
        return reportRepo.save(reportEntity);
    }

    @Override
    public ReportEntity editEntity(ReportEntity reportEntity) {
        return reportRepo.save(reportEntity);
    }

    @Override
    public ReportEntity getById(Long id){
        return reportRepo.findById(id).orElse(null);
    }

    @Override
    public List<ReportEntity> findAllReports() {
        return reportRepo.findAll();
    }

    public List<ReportEntity> findOnePageReports(int page, int countPerPage) {
        return reportRepo.findAll(PageRequest.of(page, countPerPage)).get().collect(Collectors.toList());
    }

    @Override
    public Page<ReportEntity> findPageReports(int page, int countPerPage) {
        Page<ReportEntity> result = reportRepo.findAll(PageRequest.of(page, countPerPage));
        return result;
    }

    @Override
    public void deleteById(Long id) {
        reportRepo.deleteById(id);
    }


}
