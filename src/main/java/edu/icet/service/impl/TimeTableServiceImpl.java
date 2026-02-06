package edu.icet.service.impl;

import edu.icet.Enum.DayOfWeek;
import edu.icet.model.dto.TimeTableDTO;
import edu.icet.service.TimeTableService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TimeTableServiceImpl implements TimeTableService {

    @Override
    public void addAll(TimeTableDTO timeTable) {

    }

    @Override
    public void updateAll(TimeTableDTO timeTable) {

    }

    @Override
    public void deleteAll(Integer timeTableId) {

    }

    @Override
    public List<TimeTableDTO> getAll() {
        return List.of();
    }

    @Override
    public TimeTableDTO searchById(Integer timeTableId) {
        return null;
    }

    @Override
    public List<TimeTableDTO> searchByDayTimeTable(DayOfWeek day) {
        return List.of();
    }
}
