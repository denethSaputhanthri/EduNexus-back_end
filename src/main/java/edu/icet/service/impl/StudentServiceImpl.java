package edu.icet.service.impl;

import edu.icet.model.dto.StudentDto;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository repository;
    final ModelMapper mapper;

    @Override
    public void addAll(StudentDto student) {
        repository.save(mapper.map(student, StudentEntity.class));
    }

    @Override
    public void updateAll(StudentDto student) {
        repository.save(mapper.map(student,StudentEntity.class));
    }

    @Override
    public void deleteAll(Integer studentId) {
        repository.deleteById(studentId);
    }

    @Override
    public List<StudentDto> getAll() {
        List<StudentEntity> studentEntities=repository.findAll();
        ArrayList<StudentDto>studentDtoArrayList=new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDto studentDto=mapper.map(studentEntity,StudentDto.class);
            studentDtoArrayList.add(studentDto);
        });
        return studentDtoArrayList;
    }

    @Override
    public StudentDto searchById(Integer studentId) {
        StudentEntity entity=repository.findById(studentId).get();
        StudentDto studentDto=mapper.map(entity,StudentDto.class);
        return studentDto;
    }
}
