package com.example.ibs.controllers;

import com.example.ibs.controllers.dtos.Message;
import com.example.ibs.controllers.dtos.ReportDto;
import com.example.ibs.enteties.reportforms.ReportEntity;
import com.example.ibs.mappers.MyMapper;
import com.example.ibs.mappers.MySimpleMapper;
import com.example.ibs.service.RandomaizerService;
import com.example.ibs.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    private final RandomaizerService randomaizerService;
    private final ReportService reportService;
    private final MyMapper myMapper;
    private final MySimpleMapper simpleMapper;

    @Autowired
    public MainController(RandomaizerService randomaizerService, ReportService reportService, MyMapper myMapper, MySimpleMapper simpleMapper) {
        this.randomaizerService = randomaizerService;
        this.reportService = reportService;
        this.myMapper = myMapper;
        this.simpleMapper = simpleMapper;
    }

    @GetMapping("/test")
    public ReportEntity letsTest(){
        return randomaizerService.getRandomMainEntity();
    }

    @PostMapping("/testsave")
    public ReportDto letsTestSave(@RequestBody ReportDto reportDto){
        System.out.println();
        return myMapper.toDto(reportService.saveEntity(myMapper.toEntity(reportDto)));
    }

    @GetMapping("/get/{id}")
    public ReportDto findByID(@PathVariable Long id){
        return myMapper.toDto(reportService.getById(id));
    }

    @GetMapping("/message/{id}")
    public Message testMessage(@PathVariable Long id){
        ReportEntity byId = reportService.getById(id);
        return simpleMapper.mapToMessage(myMapper.toDto(byId));
    }

    @PostMapping("/save")
    public Message letsSave(@RequestBody Message message){

        return simpleMapper.mapToMessage(myMapper.toDto(reportService.saveEntity(myMapper.toEntity(simpleMapper.mapToDto(message)))));
    }
}
