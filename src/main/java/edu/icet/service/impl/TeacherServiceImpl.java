package edu.icet.service.impl;

import edu.icet.model.dto.TeacherDto;
import edu.icet.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {


    @Override
    public void addDetails(TeacherDto teacher) {

    }

    @Override
    public void updateDetails(TeacherDto teacher) {

    }

    @Override
    public void deleteDetails(Integer teacherId) {

    }

    @Override
    public List<TeacherDto> getAllDetails() {
        return List.of();
    }

    @Override
    public TeacherDto searchById(Integer teacherId) {
        return null;
    }
}
