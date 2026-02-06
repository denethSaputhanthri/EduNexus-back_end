package edu.icet.model.entity;

import edu.icet.Enum.DayOfWeek;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "timetable")
public class TimeTableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer timeTableId;
    private Integer classId;
    private Integer timeslotId;
    private Integer classSubjectId;
    private DayOfWeek day;
}
