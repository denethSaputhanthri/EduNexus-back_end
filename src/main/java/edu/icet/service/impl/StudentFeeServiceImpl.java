package edu.icet.service.impl;

import edu.icet.model.dto.StudentFeeDTO;
import edu.icet.service.StudentFeeService;
import edu.icet.utill.FeeStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentFeeServiceImpl implements StudentFeeService {
    @Override
    public void addStudentFee(StudentFeeDTO studentFee) {

    }

    @Override
    public void updateStudentFee(StudentFeeDTO studentFee) {

    }

    @Override
    public void deleteStudentFee(Integer studentFeeId) {

    }

    @Override
    public List<StudentFeeDTO> getAll() {
        return List.of();
    }

    @Override
    public StudentFeeDTO searchById(Integer studentFeeId) {
        return null;
    }

    @Override
    public List<StudentFeeDTO> searchByStudentId(Integer studentId) {
        return List.of();
    }

    @Override
    public List<StudentFeeDTO> searchByFeeStructure(Integer feeStructureId) {
        return List.of();
    }

    @Override
    public List<StudentFeeDTO> searchByStatus(FeeStatus status) {
        return List.of();
    }
}
