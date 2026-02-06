package edu.icet.repository;

import edu.icet.Enum.DayOfWeek;
import edu.icet.model.entity.TimeTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimeTableRepository extends JpaRepository<TimeTableEntity,Integer> {
    List<TimeTableEntity>findByDay(DayOfWeek day);
}
