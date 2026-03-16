package com.library.case1_lsp;

public class ReferenceBook extends LibraryItem {

    public ReferenceBook(String title) {
        super(title);
    }

    @Override
    public void borrow() {
        throw new UnsupportedOperationException("Reference books cannot be borrowed.");
    }
}