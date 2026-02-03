package edu.icet.service.impl;

import edu.icet.model.dto.AcademicYearDTO;
import edu.icet.service.AcademicYearService;

import java.util.List;

public class AcademicYearServiceImpl implements AcademicYearService {
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
