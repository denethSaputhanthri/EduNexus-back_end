package edu.icet.service;

import edu.icet.model.dto.NonAcademicStaffDTO;

import java.util.List;

public interface NonAcademicStaffService {
    void addNonAcademicStaff(NonAcademicStaffDTO staff);
    void updateNonAcademicStaff(NonAcademicStaffDTO staff);
    void deleteNonAcademicStaff(Integer NonAcademicStaffId);
    List<NonAcademicStaffDTO>getAll();
}
