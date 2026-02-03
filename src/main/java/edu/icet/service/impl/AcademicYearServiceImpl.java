package edu.icet.service.impl;

import edu.icet.model.dto.AcademicYearDTO;
import edu.icet.model.entity.AcademicYearEntity;
import edu.icet.repository.AcademicYearRepository;
import edu.icet.service.AcademicYearService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class AcademicYearServiceImpl implements AcademicYearService {

    final AcademicYearRepository repository;
    final ModelMapper mapper;

    @Override
    public void addAcademicYear(AcademicYearDTO year) {
        repository.save(mapper.map(year, AcademicYearEntity.class));
    }

    @Override
    public void updateAcademicYear(AcademicYearDTO year) {
        repository.save(mapper.map(year, AcademicYearEntity.class));
    }

    @Override
    public void deleteAcademicYear(Integer academicYearId) {
        repository.deleteById(academicYearId);
    }

    @Override
    public List<AcademicYearDTO> getAllDetails() {
        List<AcademicYearEntity>entities=repository.findAll();
        ArrayList<AcademicYearDTO>academicYearDTOArrayList=new ArrayList<>();
        entities.forEach(academicYearEntity -> {
            academicYearDTOArrayList.add(mapper.map(academicYearEntity,AcademicYearDTO.class));
        });
        return academicYearDTOArrayList;
    }

    @Override
    public List<AcademicYearDTO> searchByAcademicYearId(Integer academicYearId) {
        List<AcademicYearEntity>entities=repository.findByAcademicYearId(academicYearId);
        ArrayList<AcademicYearDTO>academicYearDTOArrayList=new ArrayList<>();
        entities.forEach(academicYearEntity -> {
            academicYearDTOArrayList.add(mapper.map(academicYearEntity,AcademicYearDTO.class));
        });
        return academicYearDTOArrayList;
    }

    @Override
    public List<AcademicYearDTO> searchByYearName(String yearName) {
        List<AcademicYearEntity>entities=repository.findByYearName(yearName);
        ArrayList<AcademicYearDTO>academicYearDTOArrayList=new ArrayList<>();
        entities.forEach(academicYearEntity -> {
            academicYearDTOArrayList.add(mapper.map(academicYearEntity,AcademicYearDTO.class));
        });
        return academicYearDTOArrayList;
    }

    @Override
    public List<AcademicYearDTO> searchBySchoolId(Integer schoolId) {
        List<AcademicYearEntity>entities=repository.findBySchoolId(schoolId);
        ArrayList<AcademicYearDTO>academicYearDTOArrayList=new ArrayList<>();
        entities.forEach(academicYearEntity -> {
            academicYearDTOArrayList.add(mapper.map(academicYearEntity,AcademicYearDTO.class));
        });
        return academicYearDTOArrayList;
    }

    @Override
    public List<AcademicYearDTO> searchByIsActive(Boolean isActive) {
        return List.of();
    }
}
