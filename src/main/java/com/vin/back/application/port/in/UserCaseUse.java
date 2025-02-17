package com.vin.back.application.port.in;

import java.util.List;

import com.vin.back.application.dto.ShortUserDTO;
import com.vin.back.application.dto.UserDTO;
import com.vin.back.domain.model.userEntity;

public interface UserCaseUse {
    UserDTO getUserDTOByUsername(String username);
    userEntity getUserEntityByUsername(String username);
    List<ShortUserDTO> getFollowers(String username);
    List<ShortUserDTO> getFollowed(String username);
}
