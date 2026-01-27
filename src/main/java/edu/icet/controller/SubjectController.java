package edu.icet.controller;

import edu.icet.service.SubjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/subject")
@Tag(name = "Subject-Controller",description = "Subject API Collection")
public class SubjectController {
    final SubjectService service;

}
