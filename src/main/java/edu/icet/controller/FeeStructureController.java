package edu.icet.controller;

import edu.icet.model.dto.FeeStructureDTO;
import edu.icet.service.FeeStructureService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/fees/structure")
@Tag(name = "FeesStructure-Controller",description = "FeesStructure API Collection...")
public class FeeStructureController {

    final private FeeStructureService service;

    @PostMapping("/add/details")
    public void addFeesStructure(@RequestBody FeeStructureDTO feeStructure){
        service.addFeeStructure(feeStructure);
    }

}
