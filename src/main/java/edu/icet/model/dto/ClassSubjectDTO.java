package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ClassSubjectDTO {
    private Integer classSubjectId;
    private Integer classId;
    private Integer subjectId;
    private Integer teacherId;
}
