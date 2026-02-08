package edu.icet.controller;

import edu.icet.model.dto.MarkDTO;
import edu.icet.service.MarkService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
