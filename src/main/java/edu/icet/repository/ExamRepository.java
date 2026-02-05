package edu.icet.repository;

import edu.icet.model.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamRepository extends JpaRepository<ExamEntity,Integer> {
    List<ExamEntity> findByAcademicYearId(Integer academicYearId);
    List<ExamEntity> findByTermId(Integer termId);
}
