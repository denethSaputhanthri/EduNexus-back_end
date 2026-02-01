package edu.icet.service;

import edu.icet.model.dto.SchoolDTO;

import java.util.List;

public interface SchoolService {
    void addSchool (SchoolDTO school);
    void updateSchool (SchoolDTO school);
    void deleteSchool (Integer schoolId);
    List<SchoolDTO>getAll();
    SchoolDTO searchById(Integer schoolId);
    List<SchoolDTO> searchByName(String name);
}
