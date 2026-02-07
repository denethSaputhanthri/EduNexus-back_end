package edu.icet.service.impl;

import edu.icet.Enum.DayOfWeek;
import edu.icet.model.dto.TimeSlotDTO;
import edu.icet.model.dto.TimeTableDTO;
import edu.icet.model.entity.TimeTableEntity;
import edu.icet.repository.TimeTableRepository;
import edu.icet.service.TimeSlotService;
import edu.icet.service.TimeTableService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TimeSlotServiceImpl implements TimeSlotService {

    final private TimeTableRepository repository;
    final private ModelMapper mapper;


    @Override
    public void addAll(TimeSlotDTO timeSlot) {
        repository.save(mapper.map(timeSlot, TimeTableEntity.class));
    }

    @Override
    public void updateAll(TimeSlotDTO timeSlot) {

    }

    @Override
    public void deleteAll(Integer timeSlotId) {

    }

    @Override
    public List<TimeSlotDTO> getAll() {
        return List.of();
    }

    @Override
    public List<TimeSlotDTO> searchById(Integer timeSlotId) {
        return List.of();
    }
}
