package edu.icet.service.impl;

import edu.icet.model.dto.AttendanceDTO;
import edu.icet.service.AttendanceService;
import edu.icet.utill.AStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Override
    public void addAttendance(AttendanceDTO attendance) {

    }

    @Override
    public void updateAttendance(AttendanceDTO attendance) {

    }

    @Override
    public void deleteAttendance(Integer attendanceId) {

    }

    @Override
    public List<AttendanceDTO> getAll() {
        return List.of();
    }

    @Override
    public AttendanceDTO searchByAttendanceId(Integer attendanceId) {
        return null;
    }

    @Override
    public AttendanceDTO searchByStudentId(Integer studentId) {
        return null;
    }

    @Override
    public List<AttendanceDTO> searchByClassId(Integer classId) {
        return List.of();
    }

    @Override
    public List<AttendanceDTO> searchByStatus(AStatus status) {
        return List.of();
    }

    @Override
    public List<AttendanceDTO> searchByDate(LocalDate date) {
        return List.of();
    }
}
