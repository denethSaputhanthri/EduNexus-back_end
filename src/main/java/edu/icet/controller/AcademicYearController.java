package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/academic/year")
@Tag(name = "AcademicYear-Controller",description = "AcademicYear API Collection...")
public class AcademicYearController {
}
