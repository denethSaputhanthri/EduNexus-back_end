package edu.icet.repository;

import edu.icet.model.entity.TimeSlotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimeSlotRepository extends JpaRepository<TimeSlotEntity,Integer> {
    TimeSlotEntity findByTimeSlotId(Integer timeSlotId);
}
