package com.vin.back.application.port.out.common;

public interface FindByIdPort<T, ID> {
    T findById (ID id);
}
