package edu.icet.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Integer userId;
    private Integer schoolId;
    private Integer roleId;
    private String userName;
    private String passwordHash;
    private String email;
    private String phone;
}
