package com.example.ibs.service;

import com.example.ibs.enteties.MainEntity;
import com.example.ibs.repositories.MainRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyService {

    private final RandomaizerService randomaizerService;
    private final MainRepo mainRepo;

    public MainEntity saveEntity(MainEntity mainEntity){
        return mainRepo.save(mainEntity);
    }

    public MainEntity getById(Long id){
        return mainRepo.findById(id).orElse(null);
    }
}
