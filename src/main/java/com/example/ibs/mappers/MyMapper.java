package com.example.ibs.mappers;

import com.example.ibs.controllers.dtos.Message;
import com.example.ibs.controllers.dtos.ReportDto;
import com.example.ibs.enteties.reportforms.ReportEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface MyMapper {

    ReportDto toDto(ReportEntity reportEntity);
    ReportEntity toEntity(ReportDto reportDto);

    @Mapping(source = "id", target = "id")
    //@Mapping(source = "standartPump.CountedMounth", target = "field1_2")
    //@Mapping(source = "standartPump.UncountedMonth", target = "field1_3")
    //@Mapping(source = "standartPump.AverageDebit", target = "field1_4")
    //@Mapping(source = "standartPump.NumberOfWells", target = "field1_5")
    //@Mapping(source = "standartPump.ExtractedFromWells", target = "field1_6")
    Message toMessage(ReportDto dto);
}
