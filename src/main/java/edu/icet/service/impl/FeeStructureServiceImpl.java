package edu.icet.service.impl;

import edu.icet.model.dto.FeeStructureDTO;
import edu.icet.model.entity.FeeStructureEntity;
import edu.icet.repository.FeeStructureRepository;
import edu.icet.service.FeeStructureService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeeStructureServiceImpl implements FeeStructureService {


    final private FeeStructureRepository repository;
    final private ModelMapper mapper;

    @Override
    public void addFeeStructure(FeeStructureDTO feeStructure) {
        repository.save(mapper.map(feeStructure, FeeStructureEntity.class));
    }

    @Override
    public void updateFeeStructure(FeeStructureDTO feeStructure) {

    }

    @Override
    public void deleteFeeStructure(FeeStructureDTO feeStructure) {

    }

    @Override
    public List<FeeStructureDTO> getAll() {
        return List.of();
    }
}
