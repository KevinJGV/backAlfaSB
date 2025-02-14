package com.vin.back.application.port.out;

public interface savePort {
    <T> T save(T entity);
}
