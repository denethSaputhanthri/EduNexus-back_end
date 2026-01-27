package edu.icet.controller;

import edu.icet.model.dto.SubjectDto;
import edu.icet.service.SubjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/subject")
@Tag(name = "Subject-Controller",description = "Subject API Collection")
public class SubjectController {
    final SubjectService service;

    @PostMapping("/add/details")
    public void addSubject(@RequestBody SubjectDto subject){
        service.addAll(subject);
    }
}
