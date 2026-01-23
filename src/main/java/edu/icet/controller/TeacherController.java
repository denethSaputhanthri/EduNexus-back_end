package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
@Tag(name = "Teacher-Controller",description = "Teacher API Collection")
public class TeacherController {
}
