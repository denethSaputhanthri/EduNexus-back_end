package edu.icet.controller;

import edu.icet.model.dto.MarkDTO;
import edu.icet.service.MarkService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mark")
@Tag(name = "Mark-Controller",description = "Mark API Collection...")
public class MarkController {

    final private MarkService service;

    @PostMapping("/add/details")
    public void addMark(@RequestBody MarkDTO mark){
        service.addMark(mark);
    }

    @GetMapping("/get/details")
    public List<MarkDTO>getAll(){
        return service.getAllMark();
    }
}
