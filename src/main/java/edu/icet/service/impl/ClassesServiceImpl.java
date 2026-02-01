package edu.icet.service.impl;

import edu.icet.model.dto.ClassesDTO;
import edu.icet.model.entity.ClassesEntity;
import edu.icet.repository.ClassesRepository;
import edu.icet.service.ClassesService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor

public class ClassesServiceImpl implements ClassesService {

    final ClassesRepository repository;
    final ModelMapper mapper;

    @Override
    public void addClasses(ClassesDTO classes) {
        repository.save(mapper.map(classes, ClassesEntity.class));
    }

    @Override
    public void updateClasses(ClassesDTO classes) {
        repository.save(mapper.map(classes, ClassesEntity.class));
    }

    @Override
    public void deleteClasses(Integer classesId) {
        repository.deleteById(classesId);
    }

    @Override
    public List<ClassesDTO> getAllClasses() {
        List<ClassesEntity>entities=repository.findAll();
        ArrayList<ClassesDTO>classesDTOArrayList=new ArrayList<>();
        entities.forEach(classesEntity -> {
            classesDTOArrayList.add(mapper.map(classesEntity,ClassesDTO.class));
        });
        return classesDTOArrayList;
    }

    @Override
    public ClassesDTO searchById(Integer classesId) {
        return mapper.map(repository.findById(classesId).get(),ClassesDTO.class);
    }
}
