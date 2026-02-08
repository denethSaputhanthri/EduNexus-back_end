package edu.icet.service.impl;

import edu.icet.model.dto.MarkDTO;
import edu.icet.service.MarkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkServiceImpl implements MarkService {

    @Override
    public void addMark(MarkDTO mark) {

    }

    @Override
    public void updateMark(MarkDTO mark) {

    }

    @Override
    public void deleteMark(Integer markId) {

    }

    @Override
    public List<MarkDTO> getAllMark() {
        return List.of();
    }

    @Override
    public MarkDTO searchById(Integer markId) {
        return null;
    }

    @Override
    public List<MarkDTO> searchByStudentId(Integer studentId) {
        return List.of();
    }
}
