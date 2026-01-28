package edu.icet.service;

import edu.icet.model.dto.UserDTO;

public interface UserService {
    public void addUser(UserDTO user);
    public void updateUser(UserDTO user);
}
