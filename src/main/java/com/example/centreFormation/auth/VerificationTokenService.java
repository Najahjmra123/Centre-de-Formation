package com.example.centreFormation.auth;

import com.example.centreFormation.config.securityModel.TokenVerification;
import com.example.centreFormation.entity.User;
import org.springframework.http.ResponseEntity;

import javax.xml.ws.Response;

public interface VerificationTokenService {
    void saveUserVerificationToken(User user, String token);
    String validateToken(String token);
    ResponseEntity<Response> verifyEmail(String token);
    TokenVerification generateNewVerificationToken(String oldToken);
}
