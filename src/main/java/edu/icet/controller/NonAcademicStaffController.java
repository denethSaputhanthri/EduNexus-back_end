package edu.icet.controller;

import edu.icet.model.dto.NonAcademicStaffDTO;
import edu.icet.service.NonAcademicStaffService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
