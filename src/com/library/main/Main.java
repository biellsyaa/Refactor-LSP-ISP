package com.library.main;

import com.library.case1_lsp.Borrowable;
import com.library.case1_lsp.BorrowableBook;
import com.library.case1_lsp.LibraryItem;
import com.library.case1_lsp.ReferenceBook;

// import com.library.case2_isp.EmailNotification;
// import com.library.case2_isp.EmailSender;
// import com.library.case2_isp.PushNotification;
// import com.library.case2_isp.PushSender;
// import com.library.case2_isp.SMSNotification;
// import com.library.case2_isp.SmsSender;

// import com.library.case3_isp.AdvancedOfficeMachine;
// import com.library.case3_isp.BasicPrinter;
// import com.library.case3_isp.Fax;
// import com.library.case3_isp.Printer;
// import com.library.case3_isp.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CASE 1: LSP AFTER REFACTOR ===");
        LibraryItem item1 = new BorrowableBook("Clean Code");
        LibraryItem item2 = new ReferenceBook("Encyclopedia of Science");

        System.out.println("Library item: " + item1.getTitle());
        System.out.println("Library item: " + item2.getTitle());

        if (item1 instanceof Borrowable) {
            ((Borrowable) item1).borrow();
        }

        System.out.println(item2.getTitle() + " is a reference book and cannot be borrowed.");

        // System.out.println("\n=== CASE 2: ISP AFTER REFACTOR ===");
        // EmailSender emailSender = new EmailNotification();
        // emailSender.sendEmail("Welcome to the library!");

        // SmsSender smsSender = new SMSNotification();
        // smsSender.sendSMS("Your borrowed book is due tomorrow.");

        // PushSender pushSender = new PushNotification();
        // pushSender.sendPushNotification("A new book has been added to the catalog.");

        // System.out.println("\n=== CASE 3: ISP AFTER REFACTOR ===");
        // Printer basicPrinter = new BasicPrinter();
        // basicPrinter.print("Library Report");

        // AdvancedOfficeMachine officeMachine = new AdvancedOfficeMachine();
        // officeMachine.print("Monthly Summary");
        // officeMachine.scan("Borrowing Form");
        // officeMachine.fax("Urgent Notice");

        // Printer printer = officeMachine;
        // Scanner scanner = officeMachine;
        // Fax fax = officeMachine;

        // printer.print("Inventory Report");
        // scanner.scan("Student ID Card");
        // fax.fax("Official Memo");
    }
}