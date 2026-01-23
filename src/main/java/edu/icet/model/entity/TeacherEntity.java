package edu.icet.model.entity;

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
@Table(name = "teacher")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherId;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String phone;
    private String qualification;
    private String specialization;
}
