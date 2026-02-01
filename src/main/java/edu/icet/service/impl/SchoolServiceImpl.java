package edu.icet.service.impl;

import edu.icet.model.dto.SchoolDTO;
import edu.icet.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Override
    public void addSchool(SchoolDTO school) {

    }

    @Override
    public void updateSchool(SchoolDTO school) {

    }

    @Override
    public void deleteSchool(Integer schoolId) {

    }

    @Override
    public List<SchoolDTO> getAll() {
        return List.of();
    }

    @Override
    public SchoolDTO searchById(Integer schoolId) {
        return null;
    }

    @Override
    public List<SchoolDTO> searchByName(String name) {
        return List.of();
    }
}
