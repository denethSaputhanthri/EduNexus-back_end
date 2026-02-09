package edu.icet.service.impl;

import edu.icet.utill.ExamType;
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
        repository.deleteById(examId);
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
        return mapper.map(repository.findById(examId).get(),ExamDTO.class);
    }

    @Override
    public List<ExamDTO> searchByAcademicYearId(Integer academicYearId) {
        List<ExamEntity>entities=repository.findByAcademicYearId(academicYearId);
        ArrayList<ExamDTO>examDTOArrayList=new ArrayList<>();
        entities.forEach(examEntity -> {
            examDTOArrayList.add(mapper.map(examEntity, ExamDTO.class));
        });
        return examDTOArrayList;
    }

    @Override
    public List<ExamDTO> searchByTermId(Integer termId) {
        List<ExamEntity>entities=repository.findByTermId(termId);
        ArrayList<ExamDTO>examDTOArrayList=new ArrayList<>();
        entities.forEach(examEntity -> {
            examDTOArrayList.add(mapper.map(examEntity, ExamDTO.class));
        });
        return examDTOArrayList;
    }

    @Override
    public List<ExamDTO> searchByType(ExamType type) {
        List<ExamEntity>entities=repository.findByType(type);
        ArrayList<ExamDTO>examDTOArrayList=new ArrayList<>();
        entities.forEach(examEntity -> {
            examDTOArrayList.add(mapper.map(examEntity, ExamDTO.class));
        });
        return examDTOArrayList;
    }

    @Override
    public List<ExamDTO> searchByName(String examName) {
        List<ExamEntity>entities=repository.findByExamName(examName);
        ArrayList<ExamDTO>examDTOArrayList=new ArrayList<>();
        entities.forEach(examEntity -> {
            examDTOArrayList.add(mapper.map(examEntity, ExamDTO.class));
        });
        return examDTOArrayList;
    }
}
