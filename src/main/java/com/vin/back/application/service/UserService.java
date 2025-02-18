package com.vin.back.application.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vin.back.application.dto.FollowDTO;
import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.application.dto.UserDTO;
import com.vin.back.application.exception.FollowingLogicException;
import com.vin.back.application.port.in.UserCaseUse;
import com.vin.back.application.port.out.FollowPort;
import com.vin.back.application.port.out.UserPort;
import com.vin.back.domain.mapper.UserMapper;
import com.vin.back.domain.model.FollowEntity;
import com.vin.back.domain.model.UserEntity;

@Service
public class UserService implements UserCaseUse {

    @Autowired
    private UserPort userPort;

    @Autowired
    private FollowPort followPort;

    @Override
    public UserDTO getUserByUsername(String username) {
        UserEntity user = userPort.getByUsername(username);
        List<ShortUserDTO> followers = UserMapper.toDTO(userPort.getFollowers(username));
        List<ShortUserDTO> followed = UserMapper.toDTO(userPort.getFollowed(username));
        return new UserDTO(user, followers, followed);
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
    public ShortUserDTO save(ShortUserDTO shortUserDTO) {
        return UserMapper.toDTO(userPort.save(UserMapper.toEntity(shortUserDTO)));
    }

    @Override
    public boolean toggleFollow(FollowDTO followDTO) {
        Long followedId = followDTO.getRawUserFollowedId();
        Long followerId = followDTO.getRawUserFollowerId();

        if (followerId.equals(followedId)) {
            throw new FollowingLogicException("No puedes seguirte a ti mismo.");
        }

        UserEntity follower = userPort.findById(followerId);
        UserEntity followed = userPort.findById(followedId);

        Optional<FollowEntity> follow = followPort.getByFollowerAndFollowed(followerId, followedId);

        if (follow.isPresent()) {
            followPort.delete(follow.get());
            return false;
        } else {
            FollowEntity newFollow = new FollowEntity();
            newFollow.setUserFollowerEntity(follower);
            newFollow.setUserFollowedEntity(followed);
            newFollow.setFollowdate(LocalDate.now());

            followPort.save(newFollow);
            return true;
        }
    }

}
