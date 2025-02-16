package com.vin.back.application.port.out.common;

import java.util.List;

public interface FindAllPort<T> {
    List<T> findAll();
}
