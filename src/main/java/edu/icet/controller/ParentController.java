package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent")
@Tag(name = "Parent-Controller",description = "Parent API Collection...")
public class ParentController {
}
