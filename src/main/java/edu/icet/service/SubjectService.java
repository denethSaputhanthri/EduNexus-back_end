package edu.icet.service;

import edu.icet.model.dto.SubjectDto;

import java.util.List;

public interface SubjectService {
    public void addAll(SubjectDto subject);
    public void updateAll(SubjectDto subject);
    public void deleteAll(Integer subjectId);
    public List<SubjectDto> getAll();
    public SubjectDto searchById(Integer subjectId);
}
