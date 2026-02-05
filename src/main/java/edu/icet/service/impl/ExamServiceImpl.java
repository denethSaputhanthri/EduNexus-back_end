package edu.icet.service.impl;

import edu.icet.Enum.ExamType;
import edu.icet.model.dto.ExamDTO;
import edu.icet.model.entity.ExamEntity;
import edu.icet.repository.ExamRepository;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    final private ExamRepository repository;
    final private ModelMapper mapper;

    @Override
    public void addExam(ExamDTO exam) {
        repository.save(mapper.map(exam, ExamEntity.class));
    }

    @Override
    public void updateExam(ExamDTO exam) {
        repository.save(mapper.map(exam,ExamEntity.class));
    }

    @Override
    public void deleteExam(Integer examId) {

    }

    @Override
    public List<ExamDTO> getAll() {
        List<ExamEntity>entities=repository.findAll();
        ArrayList<ExamDTO>examDTOArrayList=new ArrayList<>();
        entities.forEach(examEntity -> {
            examDTOArrayList.add(mapper.map(examEntity, ExamDTO.class));
        });
        return examDTOArrayList;
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
