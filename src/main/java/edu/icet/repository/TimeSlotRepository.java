package edu.icet.repository;

import edu.icet.model.entity.TimeSlotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeSlotRepository extends JpaRepository<TimeSlotEntity,Integer> {
}
