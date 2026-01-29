package edu.icet.controller;

import edu.icet.model.dto.UserDTO;
import edu.icet.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Tag(name = "User-Controller",description = "User API collection...")
public class UserController {

    final UserService service;

    @PostMapping("/add/details")
    public void addUser(@RequestBody UserDTO user){
        service.addUser(user);
    }
    @PutMapping("/update/details")
    public void updateUser(@RequestBody UserDTO user){
        service.updateUser(user);
    }
    @GetMapping("/get/details")
    public List<UserDTO> getAllDetails(){
        return service.getAll();
    }
    @DeleteMapping("/delete/details/{userId}")
    public void deleteUser(@PathVariable Integer userId){
        service.deleteUser(userId);
    }
}
