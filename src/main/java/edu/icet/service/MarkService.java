package edu.icet.service;

import edu.icet.model.dto.MarkDTO;

import java.util.List;

public interface MarkService {
    void addMark(MarkDTO mark);
    void updateMark(MarkDTO mark);
    void deleteMark(Integer markId);
    List<MarkDTO>getAllMark();
    MarkDTO searchById(Integer markId);
    MarkDTO searchByStudentId(Integer studentId);
}
