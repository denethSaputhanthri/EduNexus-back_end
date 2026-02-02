package edu.icet.service.impl;

import edu.icet.model.dto.SchoolDTO;
import edu.icet.model.entity.SchoolEntity;
import edu.icet.repository.SchoolRepository;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        repository.save(mapper.map(school, SchoolEntity.class));
    }

    @Override
    public void deleteSchool(Integer schoolId) {
        repository.deleteById(schoolId);
    }

    @Override
    public List<SchoolDTO> getAll() {
        List<SchoolEntity>entities=repository.findAll();
        ArrayList<SchoolDTO>schoolDTOArrayList=new ArrayList<>();
        entities.forEach(schoolEntity -> {
            schoolDTOArrayList.add(mapper.map(schoolEntity, SchoolDTO.class));
        });
        return schoolDTOArrayList;
    }

    @Override
    public SchoolDTO searchById(Integer schoolId) {
        return mapper.map(repository.findById(schoolId).get(),SchoolDTO.class);
    }

    @Override
    public List<SchoolDTO> searchByName(String name) {
        List<SchoolEntity>entities=repository.findByName(name);
        ArrayList<SchoolDTO>schoolDTOArrayList=new ArrayList<>();
        entities.forEach(schoolEntity -> {
            schoolDTOArrayList.add(mapper.map(schoolEntity,SchoolDTO.class));
        });
        return schoolDTOArrayList;
    }
}
