package com.example.centreFormation.config.securityRepository;

import com.example.centreFormation.config.securityModel.TokenVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenVerificationRepository extends JpaRepository<TokenVerification,Long> {
    TokenVerification findByToken(String token);
}
