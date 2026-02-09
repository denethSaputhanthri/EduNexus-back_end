package edu.icet.model.dto;

import edu.icet.utill.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SchoolDTO {
    private Integer schoolId;
    private String name;
    private String code;
    private String address;
    private String email;
    private String phone;
    private Status status;
}
