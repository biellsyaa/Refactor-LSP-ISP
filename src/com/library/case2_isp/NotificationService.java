package com.library.case2_isp;

public interface NotificationService {
    void sendEmail(String message);
    void sendSMS(String message);
    void sendPushNotification(String message);
}