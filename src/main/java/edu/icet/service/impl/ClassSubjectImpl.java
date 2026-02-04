package edu.icet.service.impl;

import edu.icet.model.dto.ClassSubjectDTO;
import edu.icet.model.entity.ClassSubjectEntity;
import edu.icet.repository.ClassSubjectRepository;
import edu.icet.service.ClassSubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassSubjectImpl implements ClassSubjectService {

    final ClassSubjectRepository repository;
    final ModelMapper mapper;

    @Override
    public void addClassSubject(ClassSubjectDTO classSubject) {
        repository.save(mapper.map(classSubject, ClassSubjectEntity.class));
    }

    @Override
    public void updateClassSubject(ClassSubjectDTO classSubject) {
        repository.save(mapper.map(classSubject, ClassSubjectEntity.class));
    }

    @Override
    public void deleteClassSubject(Integer classSubjectId) {
        repository.deleteById(classSubjectId);
    }

    @Override
    public List<ClassSubjectDTO> getAll() {
        List<ClassSubjectEntity>entities=repository.findAll();
        ArrayList<ClassSubjectDTO>classSubjectDTOArrayList=new ArrayList<>();
        entities.forEach(classSubjectEntity -> {
            classSubjectDTOArrayList.add(mapper.map(classSubjectEntity,ClassSubjectDTO.class));
        });
        return classSubjectDTOArrayList;
    }
}
