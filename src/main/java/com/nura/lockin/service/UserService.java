package com.nura.lockin.service;

import com.nura.lockin.dto.UserDTO;
import com.nura.lockin.entities.UserEntity;
import com.nura.lockin.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void saveUser(UserDTO userDTO){
        UserEntity userEntity = UserMapper.toEntity(userDTO);
        userEntity.setUserId("new-ui-id");
        System.out.println(userEntity);
    }
}
