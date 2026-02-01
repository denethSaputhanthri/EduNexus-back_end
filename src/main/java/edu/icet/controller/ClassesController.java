package edu.icet.controller;

import edu.icet.model.dto.ClassesDTO;
import edu.icet.service.ClassesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/classes")
@Tag(name = "Classes-Controller",description = "Classes API Collection...")
public class ClassesController {

    final ClassesService service;

    @PostMapping("/add/details")
    public void addClasses(@RequestBody ClassesDTO classes){
        service.addClasses(classes);
    }

    @GetMapping("/get/details")
    public List<ClassesDTO> getAllDetails(){
        return service.getAllClasses();
    }
}
