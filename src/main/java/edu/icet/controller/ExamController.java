package edu.icet.controller;

import edu.icet.service.ExamService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exam")
@Tag(name = "Exam-Controller",description = "Exam API Collection...")
public class ExamController {

    final private ExamService service;

}
