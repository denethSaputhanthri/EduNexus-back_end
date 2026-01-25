package edu.icet.service;

import edu.icet.model.dto.TeacherDto;

import java.util.List;

public interface TeacherService {
    public void addDetails(TeacherDto teacher);
    public void updateDetails(TeacherDto teacher);
    public void deleteDetails(Integer teacherId);
    public List<TeacherDto>getAllDetails();
    public TeacherDto searchById(Integer teacherId);
}
