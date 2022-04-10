package com.example.ibs.controllers.dtos;

import lombok.Data;

@Data
public class EquipmentRequestDto {
    private long id;
    private String type;
    private String name;
    private int count;
    private Long date;
    private String justification;
}
