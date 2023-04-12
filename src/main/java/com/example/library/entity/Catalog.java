package com.example.library.entity;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> books;
    // конструктор
    public Catalog() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }
    public boolean orderBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }
}
