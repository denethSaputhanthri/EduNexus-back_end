package edu.icet.service;

import edu.icet.model.dto.FeeStructureDTO;

import java.util.List;

public interface FeeStructureService {
    void addFeeStructure(FeeStructureDTO feeStructure);
    void updateFeeStructure(FeeStructureDTO feeStructure);
    void deleteFeeStructure(Integer feeStructureId);
    List<FeeStructureDTO>getAll();
}
