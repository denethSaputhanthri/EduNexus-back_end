package edu.icet.controller;

import edu.icet.model.dto.NonAcademicStaffDTO;
import edu.icet.service.NonAcademicStaffService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/non/academic/staff")
@Tag(name = "NonAcademicStaff-Controller",description = "NonAcademicStaff API Collection...")
public class NonAcademicStaffController {

    final private NonAcademicStaffService service;

    @PostMapping("/add/details")
    public void addNonAcademicStaff(@RequestBody NonAcademicStaffDTO staff){
        service.addNonAcademicStaff(staff);
    }

    @PutMapping("/update/details")
    public void updateNonAcademicStaff(@RequestBody NonAcademicStaffDTO staff){
        service.updateNonAcademicStaff(staff);
    }

    @GetMapping("/get/details")
    public List<NonAcademicStaffDTO> getNonAcademicStaff(){
        return service.getAll();
    }
}
