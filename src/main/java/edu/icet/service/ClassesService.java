package edu.icet.service;

import edu.icet.model.dto.ClassesDTO;

import java.util.List;

public interface ClassesService {
    void addClasses(ClassesDTO classes);
    void updateClasses(ClassesDTO classes);
    void deleteClasses(Integer classesId);
    List<ClassesDTO>getAllClasses();
    ClassesDTO searchById (Integer classesId);
}
