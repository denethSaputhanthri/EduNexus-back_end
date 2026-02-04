package edu.icet.service;

import edu.icet.model.dto.ClassSubjectDTO;

import java.util.List;

public interface ClassSubjectService {
    void addClassSubject(ClassSubjectDTO classSubject);
    void updateClassSubject(ClassSubjectDTO classSubject);
    void deleteClassSubject(Integer classSubjectId);
    List<ClassSubjectDTO> getAll();
}
