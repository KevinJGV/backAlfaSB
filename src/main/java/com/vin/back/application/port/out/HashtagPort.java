package com.vin.back.application.port.out;

import java.util.List;
import java.util.Optional;

import com.vin.back.application.port.out.common.SavePort;
import com.vin.back.domain.model.HashtagEntity;

public interface HashtagPort extends SavePort<HashtagEntity> {
    HashtagEntity getByName(String name);
    List<HashtagEntity> saveAll(List<HashtagEntity> hashtags);
}
