package edu.icet.controller;

import edu.icet.service.StudentFeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student/fee")
@Tag(name = "StudentFee-Controller",description = "StudentFee API Collection...")
public class StudentFeeController {

    final private StudentFeeService service;

}
