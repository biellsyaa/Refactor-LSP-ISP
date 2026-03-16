package com.library.case1_lsp;

public class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public void borrow() {
        System.out.println(title + " has been borrowed.");
    }
}