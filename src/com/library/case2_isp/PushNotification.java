package com.library.case2_isp;

public class PushNotification implements PushSender {

    @Override
    public void sendPushNotification(String message) {
        System.out.println("Push notification sent: " + message);
    }
}