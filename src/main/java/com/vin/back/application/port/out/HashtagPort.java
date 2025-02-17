package com.vin.back.application.port.out;

import java.util.Optional;

import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.HashtagEntity;

public interface HashtagPort extends SavePort<HashtagEntity> {
    Optional<HashtagEntity> getByName(String name);
}
