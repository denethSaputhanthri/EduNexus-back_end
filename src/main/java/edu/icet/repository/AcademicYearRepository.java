package edu.icet.repository;

import edu.icet.model.entity.AcademicYearEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AcademicYearRepository extends JpaRepository<AcademicYearEntity,Integer> {
    List<AcademicYearEntity> findByAcademicYearId(Integer academicYearId);
}
