package edu.icet.service.impl;

import edu.icet.model.dto.ParentDTO;
import edu.icet.model.entity.ParentEntity;
import edu.icet.repository.ParentRepository;
import edu.icet.service.ParentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        repository.save(mapper.map(parent, ParentEntity.class));
    }

    @Override
    public void deleteParent(Integer parentId) {
        repository.deleteById(parentId);
    }

    @Override
    public List<ParentDTO> getAll() {
        List<ParentEntity> entities = repository.findAll();
        ArrayList<ParentDTO>parentDTOArrayList=new ArrayList<>();
        entities.forEach(parentEntity -> {
            parentDTOArrayList.add(mapper.map(parentEntity,ParentDTO.class));
        });
        return parentDTOArrayList;
    }
}
