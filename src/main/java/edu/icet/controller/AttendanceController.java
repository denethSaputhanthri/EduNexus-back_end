package edu.icet.controller;

import edu.icet.model.dto.AttendanceDTO;
import edu.icet.service.AttendanceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/attendance")
@Tag(name = "Attendance-Controller",description = "Attendance API Collection...")
public class AttendanceController {

    final private AttendanceService service;

    @PostMapping("/add/details")
    public void addAttendance(@RequestBody AttendanceDTO attendance){
        service.addAttendance(attendance);
    }

    @PutMapping("/update/details")
    public void updateAttendance(@RequestBody AttendanceDTO attendance){
        service.updateAttendance(attendance);
    }

    @DeleteMapping("/delete/details/{attendanceId}")
    public void deleteAttendance(@PathVariable Integer attendanceId){
        service.deleteAttendance(attendanceId);
    }

    @GetMapping("/get/details")
    public List<AttendanceDTO>getAll(){
        return service.getAll();
    }

    @GetMapping("/searchBy{attendanceId}")
    public AttendanceDTO searchByAttendanceId(@PathVariable Integer attendanceId){
        return service.searchByAttendanceId(attendanceId);
    }

    @GetMapping("/searchBy/{studentId}")
    public List<AttendanceDTO> searchByStudentId(@PathVariable Integer studentId){
        return service.searchByStudentId(studentId);
    }

    @GetMapping("/searchByClass/{classId}")
    public List<AttendanceDTO> searchByClassId(@PathVariable Integer classId){
        return service.searchByClassId(classId);
    }
}
