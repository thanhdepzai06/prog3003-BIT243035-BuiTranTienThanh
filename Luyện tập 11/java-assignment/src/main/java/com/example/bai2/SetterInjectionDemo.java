package com.example.bai2;

public class SetterInjectionDemo {
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.notifyUser("Xin chao, day la thong bao qua Email.");

        notification.setMessageService(new SMSService());
        notification.notifyUser("Xin chao, day la thong bao qua SMS.");
    }
}
