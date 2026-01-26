package edu.icet.service.impl;

import edu.icet.model.dto.SubjectDto;
import edu.icet.service.SubjectService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {

    @Override
    public void addAll(SubjectDto subject) {

    }

    @Override
    public void updateAll(SubjectDto subject) {

    }

    @Override
    public void deleteAll(Integer subjectId) {

    }

    @Override
    public List<SubjectDto> getAll() {
        return List.of();
    }

    @Override
    public SubjectDto searchById(Integer subjectId) {
        return null;
    }
}
