package org.example.solid.singleresponsability;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Book book1 = new Book("Livro 1", "Sei lá", new Date());
        Book book2 = new Book("Livro 2", "Sei lá 2", new Date());

        Books books = new Books();
        books.addBook(book1);
        books.addBook(book2);

        books.showBooks();

        books.deleteBooks(book2);

        books.showBooks();

    }
}