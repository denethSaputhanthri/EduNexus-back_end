package edu.icet.service.impl;

import edu.icet.model.dto.ClassesDTO;
import edu.icet.repository.ClassesRepository;
import edu.icet.service.ClassesService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ClassesServiceImpl implements ClassesService {

    final ClassesRepository repository;
    final ModelMapper mapper;

    @Override
    public void addClasses(ClassesDTO classes) {

    }

    @Override
    public void updateClasses(ClassesDTO classes) {

    }

    @Override
    public void deleteClasses(Integer classesId) {

    }

    @Override
    public List<ClassesDTO> getAllClasses() {
        return List.of();
    }

    @Override
    public ClassesDTO searchById(Integer classesId) {
        return null;
    }
}
