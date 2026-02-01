package edu.icet.controller;

import edu.icet.service.SchoolService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/School")
@Tag(name = "School-Controller",description = "School API Collection...")
public class SchoolController {

    final SchoolService service;

}
