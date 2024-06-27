package org.example;

import java.util.Set;

public interface BookOperation {
    void addBook(Book book);

    Set<Book> showBooks() throws Exception;

    String deleteBooks(Book book);
}