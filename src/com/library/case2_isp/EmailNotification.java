package com.library.case2_isp;

public class EmailNotification implements NotificationService {

    @Override
    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }

    @Override
    public void sendSMS(String message) {
        throw new UnsupportedOperationException("EmailNotification does not support SMS.");
    }

    @Override
    public void sendPushNotification(String message) {
        throw new UnsupportedOperationException("EmailNotification does not support push notification.");
    }
}