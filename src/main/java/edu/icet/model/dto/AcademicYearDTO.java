package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class AcademicYearDTO {
    private Integer academicYearId;
    private Integer schoolId;
    private String yearName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isActive;
}
