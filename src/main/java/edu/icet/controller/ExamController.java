package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
@Tag(name = "Exam-Controller",description = "Exam API Collection...")
public class ExamController {
}
