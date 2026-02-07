package edu.icet.model.entity;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Tag(name = "timeSlot")
public class TimeSlotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer timeSlotId;
    private Integer schoolId;
    private LocalTime startTime;
    private LocalTime endTime;
}
