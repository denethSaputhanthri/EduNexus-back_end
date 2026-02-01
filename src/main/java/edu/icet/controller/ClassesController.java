package edu.icet.controller;

import edu.icet.model.dto.ClassesDTO;
import edu.icet.service.ClassesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
