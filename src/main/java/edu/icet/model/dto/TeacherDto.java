package edu.icet.model.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeacherDto {
    private Integer teacherId;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String phone;
    private String qualification;
    private String specialization;
}
