package com.library.main;

import com.library.case1_lsp.BorrowableBook;
import com.library.case1_lsp.LibraryItem;
import com.library.case1_lsp.ReferenceBook;
import com.library.case2_isp.EmailNotification;
import com.library.case2_isp.NotificationService;
import com.library.case2_isp.SMSNotification;
import com.library.case3_isp.AdvancedOfficeMachine;
import com.library.case3_isp.BasicPrinter;
import com.library.case3_isp.MultiFunctionMachine;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CASE 1: LSP VIOLATION ===");
        LibraryItem book1 = new BorrowableBook("Clean Code");
        LibraryItem book2 = new ReferenceBook("Encyclopedia of Science");

        book1.borrow();

        try {
            book2.borrow();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== CASE 2: ISP VIOLATION ===");
        NotificationService emailService = new EmailNotification();
        emailService.sendEmail("Welcome to the library!");

        try {
            emailService.sendSMS("This should not be sent.");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        NotificationService smsService = new SMSNotification();
        smsService.sendSMS("Your borrowed book is due tomorrow.");

        try {
            smsService.sendPushNotification("This should not be sent.");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== CASE 3: ISP VIOLATION ===");
        MultiFunctionMachine basicPrinter = new BasicPrinter();
        basicPrinter.print("Library Report");

        try {
            basicPrinter.scan("Member Card");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        MultiFunctionMachine officeMachine = new AdvancedOfficeMachine();
        officeMachine.print("Monthly Summary");
        officeMachine.scan("Borrowing Form");
        officeMachine.fax("Urgent Notice");
    }
}