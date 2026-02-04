package edu.icet.controller;

import edu.icet.service.ClassSubjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/class/subject")
@Tag(name = "ClassSubject-Controller",description = "ClassSubject API Collection...")
public class ClassSubjectController {

    final ClassSubjectService service;

}
