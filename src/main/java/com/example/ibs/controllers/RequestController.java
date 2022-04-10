package com.example.ibs.controllers;

import com.example.ibs.controllers.dtos.EquipmentRequestDto;
import com.example.ibs.mappers.MyMapper;
import com.example.ibs.service.RequestService;
import com.sun.istack.Nullable;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/equipment")
public class RequestController {

    private final RequestService requestService;
    private final MyMapper myMapper;

    @Autowired
    public RequestController(RequestService requestService, MyMapper myMapper) {
        this.requestService = requestService;
        this.myMapper = myMapper;
    }

    @ApiOperation("Получение всех заявок на оборудование")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @GetMapping(
            produces = APPLICATION_JSON_VALUE
    )
    public Page<EquipmentRequestDto> allRequests(
            @RequestParam("pageNumber") @Nullable Integer page,
            @RequestParam("pageSize") @Nullable Integer countPerPage) {
        return requestService.getPageEquipments(page,countPerPage).map(myMapper::toEquipmentDto);
    }

    @ApiOperation("Получение заявки по id")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @GetMapping(
            value = "/{id}",
            produces = APPLICATION_JSON_VALUE
    )
    public EquipmentRequestDto getOne(
            @PathVariable Long id) {
        return myMapper.toEquipmentDto(requestService.getById(id));
    }

    @ApiOperation("Редактирование заявки")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PutMapping(
            value = "/{id}",
            consumes = APPLICATION_JSON_VALUE
    )
    public void update(
            @PathVariable Long id,
            @RequestBody EquipmentRequestDto equipmentRequestDto) {
            requestService.update(id,myMapper.toEquipment(equipmentRequestDto));
    }

    @ApiOperation("Удаление заявки")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @DeleteMapping(
            value = "/{id}"
    )
    public void delete(
            @PathVariable Long id) {
        requestService.deleteById(id);
    }

    @ApiOperation("Заявка на получение оборудования")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            consumes = APPLICATION_JSON_VALUE
    )
    public void newRequest(
            @RequestBody
            @ApiParam(value = "EquipmentRequest", required = true)
                    EquipmentRequestDto equipmentRequestDto) {
        requestService.saveEquipmentRequest(myMapper.toEquipment(equipmentRequestDto));
    }

    @ApiOperation("Удовлетворение заявки")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            value = "/{id}/approve",
            consumes = APPLICATION_JSON_VALUE
    )
    public void approve(
            @PathVariable Long id) {
        requestService.approve(id);
    }


    @ApiOperation("Отказ по заявке")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping("/{id}/reject")
    public void reject(
            @PathVariable Long id) {
        requestService.refuse(id);

    }

}
