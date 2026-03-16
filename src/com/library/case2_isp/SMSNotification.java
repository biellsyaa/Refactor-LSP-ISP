package com.library.case2_isp;

public class SMSNotification implements SmsSender {

    @Override
    public void sendSMS(String message) {
        System.out.println("SMS sent: " + message);
    }
}