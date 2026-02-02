package edu.icet.repository;

import edu.icet.model.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<SchoolEntity,Integer> {
    List<SchoolEntity> findByName(String name);
}
