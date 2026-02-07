package edu.icet.service.impl;
import edu.icet.model.dto.TimeSlotDTO;
import edu.icet.model.entity.TimeSlotEntity;
import edu.icet.repository.TimeSlotRepository;
import edu.icet.service.TimeSlotService;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class TimeSlotServiceImpl implements TimeSlotService{

    final private TimeSlotRepository repository;
    final private ModelMapper mapper;


    @Override
    public void addAll(TimeSlotDTO timeSlot) {
        repository.save(mapper.map(timeSlot,TimeSlotEntity.class));
    }

    @Override
    public void updateAll(TimeSlotDTO timeSlot) {
        repository.save(mapper.map(timeSlot,TimeSlotEntity.class));
    }

    @Override
    public void deleteAll(Integer timeSlotId) {

    }

    @Override
    public List<TimeSlotDTO> getAll() {
        List<TimeSlotEntity>entities=repository.findAll();
        ArrayList<TimeSlotDTO>timeSlotDTOArrayList=new ArrayList<>();
        entities.forEach(timeSlotEntity -> {
            timeSlotDTOArrayList.add(mapper.map(timeSlotEntity,TimeSlotDTO.class));
        });
        return timeSlotDTOArrayList;
    }

    @Override
    public List<TimeSlotDTO> searchById(Integer timeSlotId) {
        return List.of();
    }
}
