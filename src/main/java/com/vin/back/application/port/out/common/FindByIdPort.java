package com.vin.back.application.port.out.common;

public interface FindByIdPort<T> {
    T findById (Long id);
}
