package edu.icet.service.impl;

import edu.icet.model.dto.StudentFeeDTO;
import edu.icet.model.entity.StudentFeeEntity;
import edu.icet.repository.StudentFeeRepository;
import edu.icet.service.StudentFeeService;
import edu.icet.utill.FeeStatus;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentFeeServiceImpl implements StudentFeeService {

    final private StudentFeeRepository repository;
    final private ModelMapper mapper;

    @Override
    public void addStudentFee(StudentFeeDTO studentFee) {
        repository.save(mapper.map(studentFee, StudentFeeEntity.class));
    }

    @Override
    public void updateStudentFee(StudentFeeDTO studentFee) {
        repository.save(mapper.map(studentFee, StudentFeeEntity.class));
    }

    @Override
    public void deleteStudentFee(Integer studentFeeId) {
        repository.deleteById(studentFeeId);
    }

    @Override
    public List<StudentFeeDTO> getAll() {
        List<StudentFeeEntity>entities=repository.findAll();
        ArrayList<StudentFeeDTO>studentFeeDTOArrayList=new ArrayList<>();
        entities.forEach(studentFeeEntity -> {
            studentFeeDTOArrayList.add(mapper.map(studentFeeEntity,StudentFeeDTO.class));
        });
        return studentFeeDTOArrayList;
    }

    @Override
    public StudentFeeDTO searchById(Integer studentFeeId) {
        return mapper.map(repository.findById(studentFeeId).get(),StudentFeeDTO.class);
    }

    @Override
    public List<StudentFeeDTO> searchByStudentId(Integer studentId) {
        List<StudentFeeEntity>entities=repository.findByStudentId(studentId);
        ArrayList<StudentFeeDTO>studentFeeDTOArrayList=new ArrayList<>();
        entities.forEach(studentFeeEntity -> {
            studentFeeDTOArrayList.add(mapper.map(studentFeeEntity,StudentFeeDTO.class));
        });
        return studentFeeDTOArrayList;
    }

    @Override
    public List<StudentFeeDTO> searchByFeeStructure(Integer feeStructureId) {
        List<StudentFeeEntity>entities=repository.findByFeeStructureId(feeStructureId);
        ArrayList<StudentFeeDTO>studentFeeDTOArrayList=new ArrayList<>();
        entities.forEach(studentFeeEntity -> {
            studentFeeDTOArrayList.add(mapper.map(studentFeeEntity,StudentFeeDTO.class));
        });
        return studentFeeDTOArrayList;
    }

    @Override
    public List<StudentFeeDTO> searchByStatus(FeeStatus feeStatus) {
        List<StudentFeeEntity>entities=repository.findByFeeStatus(feeStatus);
        ArrayList<StudentFeeDTO>studentFeeDTOArrayList=new ArrayList<>();
        entities.forEach(studentFeeEntity -> {
            studentFeeDTOArrayList.add(mapper.map(studentFeeEntity,StudentFeeDTO.class));
        });
        return studentFeeDTOArrayList;
    }
}
