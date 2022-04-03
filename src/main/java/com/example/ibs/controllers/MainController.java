package com.example.ibs.controllers;

import com.example.ibs.enteties.MainEntity;
import com.example.ibs.service.MyService;
import com.example.ibs.service.RandomaizerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final RandomaizerService randomaizerService;
    private final MyService myService;

    @GetMapping("/test")
    public MainEntity letsTest(){
        return randomaizerService.getRandomMainEntity();
    }

    @PostMapping("/testsave")
    public MainEntity letsTestSave(@RequestBody MainEntity mainEntity){
        return myService.saveEntity(mainEntity);
    }

    @GetMapping("/get{id}")
    public MainEntity findByID(@PathVariable Long id){
        return myService.getById(id);
    }


}
