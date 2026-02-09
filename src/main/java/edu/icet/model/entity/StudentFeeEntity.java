package edu.icet.model.entity;

import edu.icet.utill.FeeStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student_fees")
public class StudentFeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentFeeId;
    private Integer studentId;
    private Integer feeStructureId;
    private LocalDate dueDate;
    private FeeStatus feeStatus;
}
