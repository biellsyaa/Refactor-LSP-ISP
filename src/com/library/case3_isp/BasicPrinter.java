package com.library.case3_isp;

public class BasicPrinter implements Printer {

    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}
