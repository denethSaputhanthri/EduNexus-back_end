package edu.icet.service.impl;

import edu.icet.model.dto.ClassesDTO;
import edu.icet.service.ClassesService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {
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
