package edu.icet.controller;

import edu.icet.model.dto.TimeSlotDTO;

import edu.icet.service.TimeSlotService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/timeslot")
@Tag(name = "TimeSlot-Controller",description = "TimeSlot API Collection...")
public class TimeSlotController {

    final private TimeSlotService service;

    @PostMapping("/add/details")
    public void addTimeSlot(@RequestBody TimeSlotDTO timeSlot){
        service.addAll(timeSlot);
    }

    @PutMapping("/update/details")
    public void updateTimeSlot(@RequestBody TimeSlotDTO timeSlot){
        service.updateAll(timeSlot);
    }

    @GetMapping("/get/details")
    public List<TimeSlotDTO> getTimeSlot(){
        return service.getAll();
    }


}
