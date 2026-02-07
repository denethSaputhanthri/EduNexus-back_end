package edu.icet.controller;

import edu.icet.model.dto.TimeSlotDTO;

import edu.icet.service.TimeSlotService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
