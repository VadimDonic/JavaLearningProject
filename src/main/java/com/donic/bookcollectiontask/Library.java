package com.donic.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    private String name;

    public Library(String inputName) {
        this.name = inputName;
        bookList = new ArrayList<>();
    }

    public void addBook(Book inputBook) {
        bookList.add(inputBook);
    }

    public void addBook(Book book1, Book book2) {
        bookList.add(book1);
        bookList.add(book2);
    }

    public int returnNumberBooks() {
        return bookList.size();
    }

    public void removeBook(int elementPosition) {
        try {
            Book deleteBook = bookList.remove(elementPosition);
            System.out.println("The following book was deleted: " + deleteBook.getTitle());
        } catch (IndexOutOfBoundsException exceptionObject) {
            System.out.println("Please review the index, something is not ok at all: " + exceptionObject.getMessage());
        }
    }

    public void removeBook(Book removedBook) {
        boolean isDeleted = bookList.remove(removedBook);
        if (isDeleted) {
            System.out.println("The book was deleted " + removedBook.getTitle());
        } else {
            System.out.println("There is not such book " + removedBook.getTitle());
        }
    }

    public void removeBook(String bookTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle() == bookTitle) {
                bookList.remove(i);
                break;
            }
        }
    }

    public void printAllTheBooks(){
        for (int i = 0; i < bookList.size(); i++){
            System.out.println("The book number: " + i + " is: " + bookList.get(i).getTitle() + " by " + bookList.get(i).getAuthor());
        }
    }

    public void addAnotherListOfBooksIntoTheLibraryList(List<Book> anotherListOfBooks){
        this.bookList.addAll(anotherListOfBooks);
    }

    public List<Book> getBookList(){
        return this.bookList;
    }
}
