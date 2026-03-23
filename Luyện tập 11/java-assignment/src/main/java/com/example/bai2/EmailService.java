package com.example.bai2;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("[EmailService] Da gui email: " + message);
    }
}
