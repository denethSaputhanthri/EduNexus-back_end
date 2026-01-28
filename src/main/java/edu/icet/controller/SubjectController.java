package edu.icet.controller;

import edu.icet.model.dto.SubjectDto;
import edu.icet.service.SubjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get/details")
    public List<SubjectDto> getAllSubject(){
        return service.getAll();
    }

    @PutMapping("/update/details")
    public void updateSubject(SubjectDto subject){
        service.updateAll(subject);
    }

    @DeleteMapping("/delete/details/{studentId}")
    public void deleteSubject(@PathVariable Integer studentId){
        service.deleteAll(studentId);
    }

    @GetMapping("/searchById/{subjectId}")
    public SubjectDto searchById(@PathVariable Integer subjectId){
        return service.searchById(subjectId);
    }
}
