package edu.icet.controller;

import edu.icet.model.dto.AcademicYearDTO;
import edu.icet.service.AcademicYearService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/academic/year")
@Tag(name = "AcademicYear-Controller",description = "AcademicYear API Collection...")
public class AcademicYearController {

    final AcademicYearService service;

    @PostMapping("/add/details")
    public void addAcademicYear(@RequestBody AcademicYearDTO year){
        service.addAcademicYear(year);
    }
}
