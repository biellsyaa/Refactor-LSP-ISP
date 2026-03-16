package com.library.case3_isp;

public class BasicPrinter implements MultiFunctionMachine {

    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("BasicPrinter does not support scanning.");
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("BasicPrinter does not support faxing.");
    }
}