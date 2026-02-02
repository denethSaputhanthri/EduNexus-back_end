package edu.icet.service.impl;

import edu.icet.model.dto.SchoolDTO;
import edu.icet.model.entity.SchoolEntity;
import edu.icet.repository.SchoolRepository;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    final SchoolRepository repository;
    final ModelMapper mapper;

    @Override
    public void addSchool(SchoolDTO school) {
        repository.save(mapper.map(school, SchoolEntity.class));
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
