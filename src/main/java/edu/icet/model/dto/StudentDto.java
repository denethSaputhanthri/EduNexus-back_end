package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
public class StudentDto {
    private Integer studentId;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String address;
    private Integer guardian;
    private String gender;

}
