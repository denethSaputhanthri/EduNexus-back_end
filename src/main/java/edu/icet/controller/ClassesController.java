package edu.icet.controller;

import edu.icet.service.ClassesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/classes")
@Tag(name = "Classes-Controller",description = "Classes API Collection...")
public class ClassesController {

    final ClassesService service;

}
