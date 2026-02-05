package edu.icet.service.impl;

import edu.icet.Enum.ExamType;
import edu.icet.model.dto.ExamDTO;
import edu.icet.service.ExamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Override
    public void addExam(ExamDTO exam) {

    }

    @Override
    public void updateExam(ExamDTO exam) {

    }

    @Override
    public void deleteExam(Integer examId) {

    }

    @Override
    public List<ExamDTO> getAll() {
        return List.of();
    }

    @Override
    public ExamDTO searchById(Integer examId) {
        return null;
    }

    @Override
    public List<ExamDTO> searchByAcademicYearId(Integer academicYearId) {
        return List.of();
    }

    @Override
    public List<ExamDTO> searchByTermId(Integer termId) {
        return List.of();
    }

    @Override
    public List<ExamDTO> searchByType(ExamType type) {
        return List.of();
    }

    @Override
    public List<ExamDTO> searchByName(String examName) {
        return List.of();
    }
}
