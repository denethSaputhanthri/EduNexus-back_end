package edu.icet.service.impl;

import edu.icet.model.dto.AttendanceDTO;
import edu.icet.model.entity.AttendanceEntity;
import edu.icet.repository.AttendanceRepository;
import edu.icet.service.AttendanceService;
import edu.icet.utill.AStatus;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {

    final private AttendanceRepository repository;
    final private ModelMapper mapper;

    @Override
    public void addAttendance(AttendanceDTO attendance) {
        repository.save(mapper.map(attendance, AttendanceEntity.class));
    }

    @Override
    public void updateAttendance(AttendanceDTO attendance) {

    }

    @Override
    public void deleteAttendance(Integer attendanceId) {

    }

    @Override
    public List<AttendanceDTO> getAll() {
        List<AttendanceEntity>entities=repository.findAll();
        ArrayList<AttendanceDTO>attendanceDTOArrayList=new ArrayList<>();
        entities.forEach(attendanceEntity -> {
            attendanceDTOArrayList.add(mapper.map(attendanceEntity, AttendanceDTO.class));
        });
        return attendanceDTOArrayList;
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
