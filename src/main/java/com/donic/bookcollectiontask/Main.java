package com.donic.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1984 = new Book("1984", "George O.");
        Book bookBuyology = new Book("Buyology", "Martin L.");
        Book bookOamenii = new Book("Oamenii", "Martin L");
        Book bookIon = new Book("Ion", "Liviu R.");

        Library classicLibrary = new Library("Librarius");

        classicLibrary.addBook(bookBuyology);
        classicLibrary.addBook(bookOamenii);
        classicLibrary.addBook(bookBuyology, bookIon);

        classicLibrary.printAllTheBooks();

        System.out.println("1.Number of books in library is: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook(2);

        classicLibrary.removeBook(book1984);

        System.out.println("2.Number of books after deleting: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook("Buyology");

        System.out.println("3.Number of books after deleting: " + classicLibrary.returnNumberBooks());

        classicLibrary.printAllTheBooks();

        Library literaLibrary = new Library("Litera");
        literaLibrary.addBook(bookIon, bookIon);
        literaLibrary.addBook(book1984, bookBuyology);
        literaLibrary.addBook(bookOamenii);

        System.out.println("Number of books in library is: " + literaLibrary.returnNumberBooks());

        Map<String, Library> librariesNetwork = new HashMap<>();

        librariesNetwork.put("str. Arborilor 22", classicLibrary);
        librariesNetwork.put("str. Gr.Vieru 14", literaLibrary);

        librariesNetwork.get("str. Gr.Vieru 14").addBook(bookIon);
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();
        librariesNetwork.get("str. Arborilor 22").addBook(bookIon);
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();

        librariesNetwork.get("str. Arborilor 22").addAnotherListOfBooksIntoTheLibraryList(literaLibrary.getBookList());
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();

        int[] tablouDeDateInt = {1, 2, 3, 8, 6, 0, 7, 9};
        System.out.println(IntNumberArrayService.getTheMinValueOfTheArray(tablouDeDateInt));
        System.out.println(IntNumberArrayService.getTheMinIndexOfTheArray(tablouDeDateInt));
        System.out.println(IntNumberArrayService.getTheAverageOfTheElements(tablouDeDateInt));


    }

}
