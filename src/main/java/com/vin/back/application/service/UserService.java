package com.vin.back.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.application.dto.UserDTO;
import com.vin.back.application.port.in.UserCaseUse;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.mapper.UserMapper;
import com.vin.back.domain.model.UserEntity;

public class UserService implements UserCaseUse{

    @Autowired
    private UserPort userPort;

    @Override
    public UserDTO getUserDTOByUsername(String username) {
        UserEntity user = userPort.getByUsername(username);
        List<ShortUserDTO> followers = UserMapper.toDTO(userPort.getFollowers(username));
        List<ShortUserDTO> followed = UserMapper.toDTO(userPort.getFollowed(username));
        return new UserDTO(user,followers,followed);
    }

    @Override
    public List<ShortUserDTO> getFollowers(String username) {
        return UserMapper.toDTO(userPort.getFollowers(username));
    }

    @Override
    public List<ShortUserDTO> getFollowed(String username) {
        return UserMapper.toDTO(userPort.getFollowed(username));
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userPort.save(userEntity);
    }    
}
