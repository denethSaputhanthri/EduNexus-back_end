package edu.icet.service.impl;

import edu.icet.Enum.DayOfWeek;
import edu.icet.model.dto.TimeTableDTO;
import edu.icet.model.entity.TimeTableEntity;
import edu.icet.repository.TimeTableRepository;
import edu.icet.service.TimeTableService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class TimeTableServiceImpl implements TimeTableService {

    final private TimeTableRepository repository;
    final private ModelMapper mapper;

    @Override
    public void addAll(TimeTableDTO timeTable) {
        repository.save(mapper.map(timeTable, TimeTableEntity.class));
    }

    @Override
    public void updateAll(TimeTableDTO timeTable) {

    }

    @Override
    public void deleteAll(Integer timeTableId) {

    }

    @Override
    public List<TimeTableDTO> getAll() {
        List<TimeTableEntity>entities=repository.findAll();
        ArrayList<TimeTableDTO>timeTableDTOArrayList=new ArrayList<>();
        entities.forEach(timeTableEntity -> {
            timeTableDTOArrayList.add(mapper.map(timeTableEntity, TimeTableDTO.class));
        });
        return timeTableDTOArrayList;
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
