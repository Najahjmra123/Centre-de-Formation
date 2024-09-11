package com.example.centreFormation.email;

public class MailException extends  org.springframework.mail.MailException{
    public MailException(String msg) {
        super(msg);
    }
}
