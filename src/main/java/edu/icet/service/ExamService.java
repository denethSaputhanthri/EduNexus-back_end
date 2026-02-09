package edu.icet.service;

import edu.icet.utill.ExamType;
import edu.icet.model.dto.ExamDTO;

import java.util.List;

public interface ExamService {
    void addExam(ExamDTO exam);
    void updateExam(ExamDTO exam);
    void deleteExam(Integer examId);
    List<ExamDTO>getAll();
    ExamDTO searchById(Integer examId);
    List<ExamDTO> searchByAcademicYearId(Integer academicYearId);
    List<ExamDTO> searchByTermId(Integer termId);
    List<ExamDTO> searchByType(ExamType type);
    List<ExamDTO> searchByName(String examName);
}
