package edu.icet.controller;

import edu.icet.model.dto.StudentFeeDTO;
import edu.icet.service.StudentFeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student/fee")
@Tag(name = "StudentFee-Controller",description = "StudentFee API Collection...")
public class StudentFeeController {

    final private StudentFeeService service;

    @PostMapping("/add/details")
    public void addStudentFee(@RequestBody StudentFeeDTO studentFee){
        service.addStudentFee(studentFee);
    }

    @PutMapping("/update/details")
    public void updateStudentFee(@RequestBody StudentFeeDTO studentFee){
        service.updateStudentFee(studentFee);
    }

    @DeleteMapping("/delete/details/{studentFeeId}")
    public void deleteStudentFee(@PathVariable Integer studentFeeId){
        service.deleteStudentFee(studentFeeId);
    }

    @GetMapping("/get/details")
    public List<StudentFeeDTO>getAll(){
        return service.getAll();
    }

    @GetMapping("/searchById/{studentFeeId}")
    public StudentFeeDTO searchById(@PathVariable Integer studentFeeId){
        return service.searchById(studentFeeId);
    }

}
