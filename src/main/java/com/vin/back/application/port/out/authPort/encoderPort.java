package com.vin.back.application.port.out.authPort;

public interface encoderPort {
    String encode(CharSequence rawPassword);
    boolean matches(CharSequence rawPassword, String savedPassword);
}
