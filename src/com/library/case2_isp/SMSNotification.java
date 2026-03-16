package com.library.case2_isp;

public class SMSNotification implements NotificationService {

    @Override
    public void sendEmail(String message) {
        throw new UnsupportedOperationException("SMSNotification does not support email.");
    }

    @Override
    public void sendSMS(String message) {
        System.out.println("SMS sent: " + message);
    }

    @Override
    public void sendPushNotification(String message) {
        throw new UnsupportedOperationException("SMSNotification does not support push notification.");
    }
}