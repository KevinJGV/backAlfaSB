package com.vin.back.application.port.out.common;

public interface SavePort<T> {
    T save(T entity);
}
