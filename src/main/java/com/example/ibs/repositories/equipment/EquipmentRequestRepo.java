package com.example.ibs.repositories.equipment;

import com.example.ibs.enteties.applicationforms.EquipmentRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRequestRepo extends JpaRepository<EquipmentRequest,Long> {
}
