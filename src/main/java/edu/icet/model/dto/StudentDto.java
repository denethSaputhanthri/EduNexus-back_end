package edu.icet.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table()
public class StudentDto {
    private Integer studentId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String address;
    private Integer guardian;
    private String gender;

}
