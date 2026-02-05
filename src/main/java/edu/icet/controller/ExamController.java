package edu.icet.controller;

import edu.icet.model.dto.ExamDTO;
import edu.icet.service.ExamService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exam")
@Tag(name = "Exam-Controller",description = "Exam API Collection...")
public class ExamController {

    final private ExamService service;

    @PostMapping("/add/details")
    public void addExam(@RequestBody ExamDTO exam){
        service.addExam(exam);
    }

    @PutMapping("/update/details")
    public void updateExam(@RequestBody ExamDTO exam){
        service.updateExam(exam);
    }

    @DeleteMapping("/delete/details/{examId}")
    public void deleteExam(@PathVariable Integer examId){
        service.deleteExam(examId);
    }

    @GetMapping("/get/details")
    public List<ExamDTO>getAll(){
        return service.getAll();
    }
}
