package edu.icet.controller;

import edu.icet.model.dto.TimeTableDTO;
import edu.icet.service.TimeTableService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/timetable")
@Tag(name = "TimeTable-Controller",description = "TimeTable API Collection...")
public class TimeTableController {

    final private TimeTableService service;

    @PostMapping("/add/details")
    public void addTimeTable(TimeTableDTO timeTable){
        service.addAll(timeTable);
    }

}
