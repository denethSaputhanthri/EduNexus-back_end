package edu.icet.controller;

import edu.icet.model.dto.TeacherDto;
import edu.icet.service.TeacherService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teacher")
@Tag(name = "Teacher-Controller",description = "Teacher API Collection")
public class TeacherController {
    private final TeacherService service;

    @PostMapping("/add/details")
    private void addTeacherDetails(@RequestBody TeacherDto teacher){
        service.addDetails(teacher);
    }
}
