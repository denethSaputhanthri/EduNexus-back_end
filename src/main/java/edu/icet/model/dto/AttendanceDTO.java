package edu.icet.model.dto;

import edu.icet.utill.AStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class AttendanceDTO {
    private Integer attendanceId;
    private Integer studentId;
    private Integer classId;
    private AStatus status;
    private LocalDate date;
    private String remark;
}
