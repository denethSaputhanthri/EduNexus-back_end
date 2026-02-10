package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class FeeStructureDTO {
    private Integer feeStructureId;
    private Integer classId;
    private Integer feeCategoryId;
    private Double amount;
}
