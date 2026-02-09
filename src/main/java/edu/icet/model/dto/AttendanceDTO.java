package edu.icet.model.dto;

import edu.icet.utill.AStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter

public class AttendanceDTO {
    private Integer attendanceId;
    private Integer studentId;
    private Integer classId;
    private AStatus status;
    private LocalDate date;
    private String remark;
}
