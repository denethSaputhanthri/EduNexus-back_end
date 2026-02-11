package edu.icet.service.impl;

import edu.icet.model.dto.NonAcademicStaffDTO;
import edu.icet.model.entity.NonAcademicStaffEntity;
import edu.icet.repository.NonAcademicStaffRepository;
import edu.icet.service.NonAcademicStaffService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NonAcademicStaffServiceImpl implements NonAcademicStaffService {

    final private NonAcademicStaffRepository repository;
    final private ModelMapper mapper;

    @Override
    public void addNonAcademicStaff(NonAcademicStaffDTO staff) {
        repository.save(mapper.map(staff, NonAcademicStaffEntity.class));
    }

    @Override
    public void updateNonAcademicStaff(NonAcademicStaffDTO staff) {
        repository.save(mapper.map(staff, NonAcademicStaffEntity.class));
    }

    @Override
    public void deleteNonAcademicStaff(Integer NonAcademicStaffId) {

    }

    @Override
    public List<NonAcademicStaffDTO> getAll() {
        List<NonAcademicStaffEntity> entities = repository.findAll();
        ArrayList<NonAcademicStaffDTO>nonAcademicStaffDTOArrayList=new ArrayList<>();
        entities.forEach(nonAcademicStaffEntity -> {
             nonAcademicStaffDTOArrayList.add(mapper.map(nonAcademicStaffEntity,NonAcademicStaffDTO.class));
        });
        return nonAcademicStaffDTOArrayList;
    }
}
