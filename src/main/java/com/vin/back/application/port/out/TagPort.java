package com.vin.back.application.port.out;

import java.util.List;

import com.vin.back.domain.model.TagEntity;

public interface TagPort {
    List<TagEntity> setAll(List<TagEntity> tags);
}
