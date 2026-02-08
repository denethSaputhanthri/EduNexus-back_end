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

    @PutMapping("/update/details")
    public void updateMark(@RequestBody MarkDTO mark){
        service.updateMark(mark);
    }

    @DeleteMapping("/delete/details/{markId}")
    public void deleteMark(@PathVariable Integer markId){
        service.deleteMark(markId);
    }

    @GetMapping("/searchById/{markId}")
    public MarkDTO searchById(@PathVariable Integer markId){
        return service.searchById(markId);
    }

    @GetMapping("/get/details")
    public List<MarkDTO>getAll(){
        return service.getAllMark();
    }


}
