package edu.icet.controller;

import edu.icet.model.dto.StudentDto;
import edu.icet.service.StudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
@Tag(name = "Student-Contoller " ,description = "student API collection...")
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
    @PutMapping("/update/details")
    public void updateAl(StudentDto student){
        service.updateAll(student);
    }
    @DeleteMapping("/delete/details/{studentId}")
    public void deleteAll(@PathVariable Integer studentId){
        service.deleteAll(studentId);
    }
    @GetMapping("/searchById/{studentId}")
    public StudentDto searchById(@PathVariable Integer studentId){
        return service.searchById(studentId);
    }
}
