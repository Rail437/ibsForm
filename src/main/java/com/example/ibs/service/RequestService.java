package com.example.ibs.service;

import com.example.ibs.enteties.applicationforms.EquipmentRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RequestService {
    List<EquipmentRequest> getAllEquipments();
    Page<EquipmentRequest> getPageEquipments(int page, int countPerPage);
    EquipmentRequest getById(Long id);
    void update(Long id, EquipmentRequest toEquipment);
    void deleteById(Long id);
    void saveEquipmentRequest(EquipmentRequest toEquipment);

    void approve(Long id);
    void refuse(Long id);
}
