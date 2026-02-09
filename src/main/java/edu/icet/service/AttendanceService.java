package edu.icet.service;

import edu.icet.model.dto.AttendanceDTO;
import edu.icet.utill.AStatus;

import java.time.LocalDate;
import java.util.List;


public interface AttendanceService {
    void addAttendance(AttendanceDTO attendance);
    void updateAttendance(AttendanceDTO attendance);
    void deleteAttendance(Integer attendanceId);
    List<AttendanceDTO>getAll();
    AttendanceDTO searchByAttendanceId(Integer attendanceId);
    List<AttendanceDTO> searchByStudentId(Integer studentId);
    List<AttendanceDTO> searchByClassId(Integer classId);
    List<AttendanceDTO> searchByStatus(AStatus status);
    List<AttendanceDTO> searchByDate(LocalDate date);
}
