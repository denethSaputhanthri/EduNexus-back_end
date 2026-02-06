package edu.icet.controller;

import edu.icet.model.dto.TimeTableDTO;
import edu.icet.service.TimeTableService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/timetable")
@Tag(name = "TimeTable-Controller",description = "TimeTable API Collection...")
public class TimeTableController {

    final private TimeTableService service;

    @PostMapping("/add/details")
    public void addTimeTable(@RequestBody TimeTableDTO timeTable){
        service.addAll(timeTable);
    }

    @PutMapping("/update/details")
    public void updateTimeTable(@RequestBody TimeTableDTO timeTable){
        service.updateAll(timeTable);
    }

    @GetMapping("/get/details")
    public List<TimeTableDTO>getAll(){
        return service.getAll();
    }
}
