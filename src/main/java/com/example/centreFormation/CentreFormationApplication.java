package com.example.centreFormation;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.crypto.SecretKey;
import javax.xml.bind.DatatypeConverter;

@SpringBootApplication
public class CentreFormationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentreFormationApplication.class, args);
		SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
		String encodedKey = DatatypeConverter.printHexBinary(key.getEncoded());

		System.out.println("Secret Key: " + key);
		System.out.println("Encoded Key: " + encodedKey);
	}

}
