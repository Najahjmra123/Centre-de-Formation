package com.example.centreFormation.controller;

import com.example.centreFormation.auth.PasswordResetTokenService;
import com.example.centreFormation.entity.User;
import com.example.centreFormation.repo.UserRepository;
import com.example.centreFormation.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserService service;
    private final PasswordResetTokenService passwordResetTokenService;



    @GetMapping("/{email}")
    public User fetchUser(@PathVariable String email) {
        return service.fetchUser(email);
    }


    //send mail for email verification
    @PostMapping("/resetrequestpassword/{email}")
    public ResponseEntity<String> verifyEmail(@PathVariable String email){

        return passwordResetTokenService.verifyEmail(email);

    }


    @PostMapping("/verifyOtp/{otp}/{email}")
    public ResponseEntity<String> verifyOtp(@PathVariable Integer otp,@PathVariable String email){
        return passwordResetTokenService.verifyOtp(otp, email);
    }

    //Now User Can change the password

    @PostMapping("/resetPassword/{email}")
    public ResponseEntity<String> changePasswordHandler(
            @RequestBody ChangePasswordResetRequest changePassword,
            @PathVariable String email
    ){
        return passwordResetTokenService.changePasswordHandler(changePassword,email);
    }



}
