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
@Table(name = "class")
public class ClassesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classesId;
    private Integer schoolId;
    private Integer academicYearId;
    private String className;
    private String section;
    private String classTeacherId;
}
