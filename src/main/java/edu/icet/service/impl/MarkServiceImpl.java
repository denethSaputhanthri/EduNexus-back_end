package edu.icet.service.impl;

import edu.icet.model.dto.MarkDTO;
import edu.icet.model.entity.MarkEntity;
import edu.icet.repository.MarkRepository;
import edu.icet.service.MarkService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarkServiceImpl implements MarkService {

    final private MarkRepository repository;
    final private ModelMapper mapper;

    @Override
    public void addMark(MarkDTO mark) {
        repository.save(mapper.map(mark,MarkEntity.class));
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
