package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ClassesDTO {
    private Integer classesId;
    private Integer schoolId;
    private Integer academicYearId;
    private String className;
    private String section;
    private String classTeacherId;
}
