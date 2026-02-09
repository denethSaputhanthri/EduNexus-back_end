package edu.icet.repository;

import edu.icet.model.entity.AttendanceEntity;
import edu.icet.utill.AStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<AttendanceEntity,Integer>{
    List<AttendanceEntity> findByStudentId(Integer studentId);
    List<AttendanceEntity> findByClassId(Integer classId);
    List<AttendanceEntity> findByStatus(AStatus status);
}
