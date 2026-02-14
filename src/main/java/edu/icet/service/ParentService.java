package edu.icet.service;

import edu.icet.model.dto.ParentDTO;

import java.util.List;

public interface ParentService {
    void addParent(ParentDTO parent);
    void updateParent(ParentDTO parent);
    void deleteParent(Integer parentId);
    List<ParentDTO>getAll();
}
