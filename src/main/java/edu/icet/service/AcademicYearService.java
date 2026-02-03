package edu.icet.service;

import edu.icet.model.dto.AcademicYearDTO;

import java.util.List;

public interface AcademicYearService {
    void addAcademicYear(AcademicYearDTO year);
    void updateAcademicYear(AcademicYearDTO year);
    void deleteAcademicYear(Integer academicYearId);
    List<AcademicYearDTO>getAllDetails();
    List<AcademicYearDTO> searchByAcademicYearId(Integer academicYearId);
    List<AcademicYearDTO> searchByYearName(String yearName);
    List<AcademicYearDTO> searchBySchoolId(Integer schoolId);
    List<AcademicYearDTO> searchByIsActive(Boolean isActive);
}
