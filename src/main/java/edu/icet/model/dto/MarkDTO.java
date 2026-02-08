package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MarkDTO {
    private Integer markId;
    private Integer examSubjectId;
    private Integer StudentId;
    private Double marksObtained;
    private String teacherRemark;
}