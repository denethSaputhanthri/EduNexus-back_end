package edu.icet.controller;

import edu.icet.model.dto.SchoolDTO;
import edu.icet.service.SchoolService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/School")
@Tag(name = "School-Controller",description = "School API Collection...")
public class SchoolController {

    final SchoolService service;

    @PostMapping("/add/details")
    public void addSchool(@RequestBody SchoolDTO school){
        service.addSchool(school);
    }

    @PutMapping("/update/details")
    public void updateSchool(@RequestBody SchoolDTO school){
        service.updateSchool(school);
    }

    @DeleteMapping ("/delete/details/{schoolId}")
    public void deleteSchool(@PathVariable Integer schoolId){
        service.deleteSchool(schoolId);
    }

    @GetMapping("/get/details")
    public List<SchoolDTO> getAll(){
        return service.getAll();
    }

    @GetMapping("/searchById/{schoolId}")
    public SchoolDTO searchById(@PathVariable Integer schoolId){
        return service.searchById(schoolId);
    }
}
