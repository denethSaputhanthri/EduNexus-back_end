package edu.icet.controller;

import edu.icet.model.dto.AcademicYearDTO;
import edu.icet.service.AcademicYearService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("/update/details")
    public void updateAcademicYear(@RequestBody AcademicYearDTO year){
        service.updateAcademicYear(year);
    }
    @DeleteMapping("/delete/details")
    public void deleteAcademicYear(Integer academicYearId){
        service.deleteAcademicYear(academicYearId);
    }

    @GetMapping("/get/details")
    public List<AcademicYearDTO>getAllDetails(){
        return service.getAllDetails();
    }
}
