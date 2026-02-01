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

    @PutMapping("/update/details")
    public void updateClasses(@RequestBody ClassesDTO classes){
        service.updateClasses(classes);
    }

    @DeleteMapping("/delete/details/{classesId}")
    public void deleteClasses(@PathVariable Integer classesId){
        service.deleteClasses(classesId);
    }

    @GetMapping("/get/details")
    public List<ClassesDTO> getAllDetails(){
        return service.getAllClasses();
    }

}
