package edu.icet.repository;

import edu.icet.model.entity.StudentFeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentFeeRepository extends JpaRepository<StudentFeeEntity,Integer> {
    List<StudentFeeEntity> findByStudentId(Integer studentId);
}
