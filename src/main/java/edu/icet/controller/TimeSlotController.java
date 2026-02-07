package edu.icet.controller;

import edu.icet.service.TimeTableService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/timeslot")
@Tag(name = "TimeSlot-Controller",description = "TimeSlot API Collection...")
public class TimeSlotController {

    final private TimeTableService service;

}
