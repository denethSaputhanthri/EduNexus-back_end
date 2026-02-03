package edu.icet.repository;

import edu.icet.model.entity.AcademicYearEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicYearRepository extends JpaRepository<AcademicYearEntity,Integer> {
}
