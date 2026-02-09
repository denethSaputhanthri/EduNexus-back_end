package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/fee")
@Tag(name = "StudentFee-Controller",description = "StudentFee API Collection...")
public class StudentFeeController {
}
