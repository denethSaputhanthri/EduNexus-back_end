package edu.icet.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fees/structure")
@Tag(name = "FeesStructure-Controller",description = "FeesStructure API Collection...")
public class FeeStructureController {
}
