package edu.icet.service.impl;

import edu.icet.model.dto.TeacherDto;
import edu.icet.model.entity.TeacherEntity;
import edu.icet.repository.TeacherRepository;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addDetails(TeacherDto teacher) {
        repository.save(mapper.map(teacher, TeacherEntity.class));
    }

    @Override
    public void updateDetails(TeacherDto teacher) {

    }

    @Override
    public void deleteDetails(Integer teacherId) {

    }

    @Override
    public List<TeacherDto> getAllDetails() {
        return List.of();
    }

    @Override
    public TeacherDto searchById(Integer teacherId) {
        return null;
    }
}
