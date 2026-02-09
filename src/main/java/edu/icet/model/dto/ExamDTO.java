package edu.icet.model.dto;

import edu.icet.utill.ExamType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ExamDTO {
    private Integer examId;
    private Integer academicYearId;
    private Integer termId;
    private String examName;
    private ExamType type;
}
