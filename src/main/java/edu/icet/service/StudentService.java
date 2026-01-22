package edu.icet.service;

import edu.icet.model.dto.StudentDto;

import java.util.List;

public interface StudentService {
    public void addAll(StudentDto student);
    public void updateAll(StudentDto student);
    public void deleteAll(Integer studentId);
    List<StudentDto> getAll();
    StudentDto searchById(Integer studentId);
}
