package com.vin.back.application.port.in.sessionCasesUse;

public interface AuthCaseUse {
    String login(String username, String password);
    void logout(String token);
    boolean isTokenInvalidated(String token);
}
