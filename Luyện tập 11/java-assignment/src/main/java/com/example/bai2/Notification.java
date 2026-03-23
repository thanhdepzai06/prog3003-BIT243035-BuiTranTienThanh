package com.example.bai2;

public class Notification {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        if (messageService == null) {
            throw new IllegalStateException("MessageService chua đuoc inject.");
        }
        messageService.sendMessage(message);
    }
}
