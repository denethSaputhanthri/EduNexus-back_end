package edu.icet.controller;

import edu.icet.model.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    final StudentService service;

    @PostMapping("/add/details")
    public void addStudent(@RequestBody StudentDto student){
        service.addAll(student);
    }
}
