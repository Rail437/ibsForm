package com.example.ibs.repositories;

import com.example.ibs.enteties.ProductionAssociateGas;
import com.example.ibs.enteties.WellValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionAssGasRepo extends JpaRepository<ProductionAssociateGas, Integer> {
}
