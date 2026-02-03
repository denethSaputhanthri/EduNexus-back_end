package edu.icet.service.impl;

import edu.icet.model.dto.AcademicYearDTO;
import edu.icet.repository.AcademicYearRepository;
import edu.icet.service.AcademicYearService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AcademicYearServiceImpl implements AcademicYearService {

    final AcademicYearRepository repository;
    final ModelMapper mapper;

    @Override
    public void addAcademicYear(AcademicYearDTO year) {

    }

    @Override
    public void updateAcademicYear(AcademicYearDTO year) {

    }

    @Override
    public void deleteAcademicYear(Integer academicYearId) {

    }

    @Override
    public List<AcademicYearDTO> getAllDetails() {
        return List.of();
    }

    @Override
    public List<AcademicYearDTO> searchByAcademicYearId(Integer academicYearId) {
        return List.of();
    }

    @Override
    public List<AcademicYearDTO> searchByYearName(String yearName) {
        return List.of();
    }

    @Override
    public List<AcademicYearDTO> searchBySchoolId(Integer schoolId) {
        return List.of();
    }

    @Override
    public List<AcademicYearDTO> searchByIsActive(Boolean isActive) {
        return List.of();
    }
}
