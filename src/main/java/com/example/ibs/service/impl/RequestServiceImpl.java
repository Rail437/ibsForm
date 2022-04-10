package com.example.ibs.service.impl;

import com.example.ibs.enteties.applicationforms.EquipmentRequest;
import com.example.ibs.repositories.equipment.EquipmentRequestRepo;
import com.example.ibs.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class RequestServiceImpl implements RequestService {
    private final EquipmentRequestRepo requestRepo;

    @Autowired
    public RequestServiceImpl(EquipmentRequestRepo requestRepo) {
        this.requestRepo = requestRepo;
    }

    @Override
    public List<EquipmentRequest> getAllEquipments() {
        return requestRepo.findAll();
    }

    @Override
    public Page<EquipmentRequest> getPageEquipments(int page, int countPerPage) {
        return requestRepo.findAll(PageRequest.of(page, countPerPage));
    }

    @Override
    public EquipmentRequest getById(Long id) {
        return requestRepo.getById(id);
    }

    @Override
    public void update(Long id, EquipmentRequest toEquipment) {
        toEquipment.setId(id);
        requestRepo.save(toEquipment);
    }

    @Override
    public void deleteById(Long id) {
        requestRepo.deleteById(id);
    }

    @Override
    public void saveEquipmentRequest(EquipmentRequest toEquipment) {
        requestRepo.save(toEquipment);
    }

    @Override
    public void approve(Long id) {
        EquipmentRequest equipmentRequest = requestRepo.getById(id);
        equipmentRequest.setApproved(true);
        requestRepo.save(equipmentRequest);
    }

    @Override
    public void refuse(Long id) {
        EquipmentRequest equipmentRequest = requestRepo.getById(id);
        equipmentRequest.setApproved(false);
        requestRepo.save(equipmentRequest);
    }
}
