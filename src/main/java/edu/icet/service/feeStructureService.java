package edu.icet.service;

import edu.icet.model.dto.FeeStructureDTO;

import java.util.List;

public interface feeStructureService {
    void addFeeStructure(FeeStructureDTO feeStructure);
    void updateFeeStructure(FeeStructureDTO feeStructure);
    void deleteFeeStructure(FeeStructureDTO feeStructure);
    List<FeeStructureDTO>getAll();
}
