package com.library.case1_lsp;

public class BorrowableBook extends LibraryItem {

    public BorrowableBook(String title) {
        super(title);
    }

    @Override
    public void borrow() {
        System.out.println(title + " has been successfully borrowed.");
    }
}