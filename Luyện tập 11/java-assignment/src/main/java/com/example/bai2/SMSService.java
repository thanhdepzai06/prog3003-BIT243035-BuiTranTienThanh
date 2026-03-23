package com.example.bai2;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("[SMSService] Da gui SMS: " + message);
    }
}
