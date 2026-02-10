package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FeeStructureDTO {
    private Integer feeStructureId;
    private Integer classId;
    private Integer feeCategoryId;
    private Double amount;
}
