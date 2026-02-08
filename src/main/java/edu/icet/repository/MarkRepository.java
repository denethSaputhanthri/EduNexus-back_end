package edu.icet.repository;

import edu.icet.model.entity.MarkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepository extends JpaRepository<MarkEntity,Integer> {
}
