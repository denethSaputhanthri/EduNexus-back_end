package edu.icet.model.dto;

import edu.icet.utill.DayOfWeek;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class TimeTableDTO {
    private Integer timeTableId;
    private Integer classId;
    private Integer timeslotId;
    private Integer classSubjectId;
    private DayOfWeek day;
}
