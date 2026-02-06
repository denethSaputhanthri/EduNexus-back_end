package edu.icet.controller;

import edu.icet.Enum.DayOfWeek;
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

    @DeleteMapping("/delete/details/{timeTableId}")
    public void deleteTimeTable(@PathVariable Integer timeTableId){
        service.deleteAll(timeTableId);
    }

    @GetMapping("/searchById/{timeTableId}")
    public TimeTableDTO searchById(@PathVariable Integer timeTableId){
        return service.searchById(timeTableId);
    }

    @GetMapping("/get/details")
    public List<TimeTableDTO>getAll(){
        return service.getAll();
    }
    @GetMapping("/searchByDay/{day}")
    public List<TimeTableDTO> searchByDay(DayOfWeek day){
        return service.searchByDayTimeTable(day);
    }
}
