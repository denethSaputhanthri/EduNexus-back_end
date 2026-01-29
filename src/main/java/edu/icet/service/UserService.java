package edu.icet.service;

import edu.icet.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    public void addUser(UserDTO user);
    public void updateUser(UserDTO user);
    public List<UserDTO>getAll();
    public void deleteUser(Integer userId);
    UserDTO searchById(Integer userId);
}
