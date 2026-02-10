package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "fee_structure")
public class FeeStructureEntity {
    private Integer feeStructureId;
    private Integer classId;
    private Integer feeCategoryId;
    private Double amount;
}
