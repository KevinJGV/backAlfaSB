package com.vin.back.application.port.out.common;

public interface DeletePort<T>{
    boolean delete(T entity);
}
