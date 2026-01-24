package edu.icet.controller;

import edu.icet.model.dto.TeacherDto;
import edu.icet.service.TeacherService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teacher")
@Tag(name = "Teacher-Controller",description = "Teacher API Collection")
public class TeacherController {
    private final TeacherService service;

    @PostMapping("/add/details")
    public void addTeacherDetails(@RequestBody TeacherDto teacher){
        service.addDetails(teacher);
    }
    @GetMapping("/get/details")
    public List<TeacherDto> getAllDetails(){
        return service.getAllDetails();
    }
    @PutMapping("/update/details")
    public void updateTeacherDetails(TeacherDto teacher){
        service.updateDetails(teacher);
    }
    @DeleteMapping("/delete/details/{teacherId}")
    public void deleteDetails(@PathVariable Integer teacherId){
        service.deleteDetails(teacherId);
    }
}
