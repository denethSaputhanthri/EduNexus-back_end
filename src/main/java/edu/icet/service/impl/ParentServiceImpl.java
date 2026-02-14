package edu.icet.service.impl;

import edu.icet.model.dto.ParentDTO;
import edu.icet.model.entity.ParentEntity;
import edu.icet.repository.ParentRepository;
import edu.icet.service.ParentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ParentServiceImpl implements ParentService {

    final private ParentRepository repository;
    final private ModelMapper mapper;

    @Override
    public void addParent(ParentDTO parent) {
        repository.save(mapper.map(parent, ParentEntity.class));
    }

    @Override
    public void updateParent(ParentDTO parent) {

    }

    @Override
    public void deleteParent(Integer parentId) {

    }

    @Override
    public List<ParentDTO> getAll() {
        return List.of();
    }
}
