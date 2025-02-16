package com.vin.back.application.port.out.sesisonPort;

public interface EncoderPort {
    String encode(CharSequence rawPassword);
    boolean matches(CharSequence rawPassword, String savedPassword);
}
