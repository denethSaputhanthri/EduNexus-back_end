package edu.icet.service;


import edu.icet.model.dto.TimeSlotDTO;

import java.util.List;

public interface TimeSlotService {
    void addAll(TimeSlotDTO timeSlot);
    void updateAll(TimeSlotDTO timeSlot);
    void deleteAll(Integer timeSlotId);
    List<TimeSlotDTO> getAll();
    TimeSlotDTO searchById(Integer timeSlotId);
}
