package edu.icet.repository;

import edu.icet.model.entity.TimeTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<TimeTableEntity,Integer> {
}
