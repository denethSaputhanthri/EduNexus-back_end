package edu.icet.service.impl;

import edu.icet.model.dto.UserDTO;
import edu.icet.model.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void addUser(UserDTO user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public void updateUser(UserDTO user) {
        repository.save(mapper.map(user,UserEntity.class));
    }

    @Override
    public List<UserDTO> getAll() {
        List<UserEntity> userEntities=repository.findAll();
        ArrayList<UserDTO> userDTOArrayList=new ArrayList<>();
        userEntities.forEach(userEntity -> {
            UserDTO userDTO=mapper.map(userEntity, UserDTO.class);
            userDTOArrayList.add(userDTO);
        });
        return userDTOArrayList;
    }

    @Override
    public void deleteUser(Integer userId) {
        repository.deleteById(userId);
    }

    @Override
    public UserDTO searchById(Integer userId) {
        UserDTO userDTO=mapper.map(repository.findById(userId).get(), UserDTO.class);
        return userDTO;
    }

}
