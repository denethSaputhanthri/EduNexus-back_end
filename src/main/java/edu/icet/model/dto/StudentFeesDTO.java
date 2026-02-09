package edu.icet.model.dto;

import edu.icet.utill.FeeStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter

public class StudentFeesDTO {
    private Integer studentFeeId;
    private Integer studentId;
    private Integer feeStructureId;
    private LocalDate dueDate;
    private FeeStatus feeStatus;
}
