package com.example.ibs.controllers;

import com.example.ibs.controllers.dtos.Message;
import com.example.ibs.mappers.MyMapper;
import com.example.ibs.mappers.MySimpleMapper;
import com.example.ibs.service.CreatePdfService;
import com.example.ibs.service.RandomaizerService;
import com.example.ibs.service.ReportService;
import com.lowagie.text.DocumentException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xhtmlrenderer.pdf.ITextRenderer;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_OCTET_STREAM_VALUE;

@RestController
@RequestMapping("/api/v1/report")
public class ReportController {

    private final RandomaizerService randomaizerService;
    private final ReportService reportService;
    private final MyMapper myMapper;
    private final MySimpleMapper simpleMapper;
    private final CreatePdfService pdfService;

    @Autowired
    public ReportController(
            RandomaizerService randomaizerService, ReportService reportService,
            MyMapper myMapper, MySimpleMapper simpleMapper, CreatePdfService pdfService) {
        this.randomaizerService = randomaizerService;
        this.reportService = reportService;
        this.myMapper = myMapper;
        this.simpleMapper = simpleMapper;
        this.pdfService = pdfService;
    }

    @ApiOperation("Посмотреть список отчетов")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            produces = APPLICATION_JSON_VALUE
    )
    public Page<Message> get(
            @RequestParam("pageNumber") int page,
            @RequestParam("pageSize") int countPerPage) {

        return reportService.findPageReports(page, countPerPage)
                .map(myMapper::toDto)
                .map(simpleMapper::mapToMessage);
    }

    @ApiOperation("Посмотреть отчет")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            value = "/{id}",
            produces = APPLICATION_JSON_VALUE
    )
    public Message get(@PathVariable("id") Long id) {
        return simpleMapper.mapToMessage(myMapper.toDto(reportService.getById(id)));
    }


    @ApiOperation("Подача отчета")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            consumes = APPLICATION_JSON_VALUE
    )
    public void report(
            @RequestBody
            @ApiParam(value = "Report", required = true)
                    Message message) {
       reportService.saveEntity(myMapper.toEntity(myMapper.inMessageToDto(message)));
    }

    @ApiOperation("Обновление отчета")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PutMapping(
            consumes = APPLICATION_JSON_VALUE
    )
    public void update(
            @RequestBody
            @ApiParam(value = "Report", required = true)
                    Message message) {
        simpleMapper.mapToMessage(
                myMapper.toDto(
                        reportService.editEntity(
                                myMapper.toEntity(
                                        simpleMapper.mapToDto(message)))));
    }

    @ApiOperation("Экспорт отчета в файл")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            value = "/download/{id}",
            produces = APPLICATION_OCTET_STREAM_VALUE
    )
    public ResponseEntity<byte[]> getFile(
            @PathVariable("id") Long id,
            @RequestParam("format") String format){
        System.out.println("id: "+id + ", format:" + format);
        byte[] pdfDoc = pdfService.performPdfDocument("src/main/resources/pages/report.html");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        // Here you have to set the actual filename of your pdf
        String filename = "output.pdf";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        return new ResponseEntity<>(pdfDoc, headers, HttpStatus.OK);
    }

}
