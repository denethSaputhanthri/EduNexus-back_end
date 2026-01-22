package edu.icet.controller;

import edu.icet.model.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    final StudentService service;

    @PostMapping("/add/details")
    public void addStudent(@RequestBody StudentDto student){
        service.addAll(student);
    }
    @GetMapping("/get/details")
    public List<StudentDto> getAll(){
        return service.getAll();
    }
}
