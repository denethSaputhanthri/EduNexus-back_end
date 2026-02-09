package edu.icet.service;

import edu.icet.model.dto.StudentFeeDTO;
import edu.icet.utill.FeeStatus;

import java.util.List;

public interface StudentFeeService {
    void addStudentFee(StudentFeeDTO studentFee);
    void updateStudentFee(StudentFeeDTO studentFee);
    void deleteStudentFee(Integer studentFeeId);
    List<StudentFeeDTO>getAll();
    StudentFeeDTO searchById(Integer studentFeeId);
    List<StudentFeeDTO> searchByStudentId(Integer studentId);
    List<StudentFeeDTO> searchByFeeStructure(Integer feeStructureId);
    List<StudentFeeDTO> searchByStatus(FeeStatus status);
}
