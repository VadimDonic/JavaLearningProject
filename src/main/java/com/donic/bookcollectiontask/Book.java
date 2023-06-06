package com.donic.bookcollectiontask;

public class Book {
    private String title;

    private String author;

    Book(String inputTitle, String inputAuthor) {
        this.title = inputTitle;
        this.author = inputAuthor;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
