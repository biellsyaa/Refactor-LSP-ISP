package com.library.case2_isp;

public class EmailNotification implements EmailSender {

    @Override
    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }
}