package edu.icet.controller;

import edu.icet.model.dto.ParentDTO;
import edu.icet.service.ParentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/parent")
@Tag(name = "Parent-Controller",description = "Parent API Collection...")
public class ParentController {

    final private ParentService service;

    @PostMapping("/add/details")
    public void addParent(@RequestBody ParentDTO parent){
        service.addParent(parent);
    }

    @PutMapping("/update/details")
    public void updateParent(@RequestBody ParentDTO parent){
        service.updateParent(parent);
    }

    @GetMapping("/getAll/details")
    public List<ParentDTO> getAll(){
        return service.getAll();
    }

}
