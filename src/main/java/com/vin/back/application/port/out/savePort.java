package com.vin.back.application.port.out;

public interface SavePort {
    <T> T save(T entity);
}
