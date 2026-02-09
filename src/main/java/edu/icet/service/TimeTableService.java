package edu.icet.service;

import edu.icet.utill.DayOfWeek;
import edu.icet.model.dto.TimeTableDTO;

import java.util.List;

public interface TimeTableService {
    void addAll(TimeTableDTO timeTable);
    void updateAll(TimeTableDTO timeTable);
    void deleteAll(Integer timeTableId);
    List<TimeTableDTO>getAll();
    TimeTableDTO searchById(Integer timeTableId);
    List<TimeTableDTO> searchByDayTimeTable(DayOfWeek day);
}
