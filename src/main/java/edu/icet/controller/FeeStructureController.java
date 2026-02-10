package edu.icet.controller;

import edu.icet.model.dto.FeeStructureDTO;
import edu.icet.service.FeeStructureService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("/update/details")
    public void updateFeesStructure(@RequestBody FeeStructureDTO feeStructure){
        service.updateFeeStructure(feeStructure);
    }

    @GetMapping("/get/details")
    public List<FeeStructureDTO>getAll(){
        return service.getAll();
    }

}
