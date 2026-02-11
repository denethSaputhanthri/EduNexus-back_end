package edu.icet.repository;

import edu.icet.model.entity.NonAcademicStaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NonAcademicStaffRepository extends JpaRepository<NonAcademicStaffEntity,Integer> {
}
