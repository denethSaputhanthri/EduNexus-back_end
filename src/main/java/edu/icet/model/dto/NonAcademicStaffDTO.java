package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class NonAcademicStaffDTO {
    private Integer staffId;
    private Integer userId;
    private Integer schoolId;
    private String jobTittle;
    private String department;
    private LocalDate joinDate;
}
