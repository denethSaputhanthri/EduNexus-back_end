package edu.icet.service.impl;

import edu.icet.model.dto.SubjectDto;
import edu.icet.model.entity.SubjectEntity;
import edu.icet.repository.SubjectRepository;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    final SubjectRepository repository;
    final ModelMapper mapper;

    @Override
    public void addAll(SubjectDto subject) {
        repository.save(mapper.map(subject, SubjectEntity.class));
    }

    @Override
    public void updateAll(SubjectDto subject) {
        repository.save(mapper.map(subject,SubjectEntity.class));

    }

    @Override
    public void deleteAll(Integer subjectId) {
        repository.deleteById(subjectId);
    }

    @Override
    public List<SubjectDto> getAll() {
        List<SubjectEntity>entities=repository.findAll();
        ArrayList<SubjectDto>subjectDtoArrayList=new ArrayList<>();
        entities.forEach(subjectEntity -> {
            SubjectDto subjectDto=mapper.map(subjectEntity,SubjectDto.class);
            subjectDtoArrayList.add(subjectDto);
        });
        return subjectDtoArrayList;
    }

    @Override
    public SubjectDto searchById(Integer subjectId) {
        return null;
    }
}
