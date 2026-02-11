package edu.icet.controller;

import edu.icet.service.NonAcademicStaffService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/non/academic/staff")
@Tag(name = "NonAcademicStaff-Controller",description = "NonAcademicStaff API Collection...")
public class NonAcademicStaffController {

    final private NonAcademicStaffService service;

}
