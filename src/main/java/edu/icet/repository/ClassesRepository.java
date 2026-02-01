package edu.icet.repository;

import edu.icet.model.entity.ClassesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<ClassesEntity,Integer> {
}
