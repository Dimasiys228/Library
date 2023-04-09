package com.example.library.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Library {
    private Map<String, List<Book>> Catalog;
    private List<Book> borrowedBooks;
    private List<Book> readingRoomBooks;
    private List<Reader> readers;
    private List<Librarian> librarians;
    private Administrator administrator;

    public Library() {
        this.Catalog = new HashMap<>();
        this.borrowedBooks = new ArrayList<>();
        this.readers = new ArrayList<>();
        this.librarians = new ArrayList<>();
        this.administrator = new Administrator();
    }

    public Map<String, List<Book>> getCatalog() {
        return Catalog;
    }

    public void setCatalog(Map<String, List<Book>> catalog) {
        Catalog = catalog;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public List<Book> getReadingRoomBooks() {
        return readingRoomBooks;
    }

    public void setReadingRoomBooks(List<Book> readingRoomBooks) {
        this.readingRoomBooks = readingRoomBooks;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public void setLibrarians(List<Librarian> librarians) {
        this.librarians = librarians;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
//    public void addBook(String title, String author, int year) {
//        Book book = new Book(title, author, year);
//        if (catalog.containsKey(book.getTitle())) {
//            catalog.get(book.getTitle()).add(book);
//        } else {
//            List<Book> books = new ArrayList<>();
//            books.add(book);
//            catalog.put(book.getTitle(), books);
//        }
//    }
//
//    // поиск книг по названию
//    public List<Book> searchByTitle(String title) {
//        if (catalog.containsKey(title)) {
//            return catalog.get(title);
//        } else {
//            return new ArrayList<>();
//        }
//    }
//
//    // поиск книг по автору
//    public List<Book> searchByAuthor(String author) {
//        List<Book> result = new ArrayList<>();
//        for (List<Book> books : catalog.values()) {
//            for (Book book : books) {
//                if (book.getAuthor().equals(author)) {
//                    result.add(book);
//                }
//            }
//        }
//        return result;
//    }
//
//    // выдача книги на абонемент
//    public boolean borrowBook(Book book, Reader reader) {
//        if (catalog.containsKey(book.getTitle())) {
//            List<Book> books = catalog.get(book.getTitle());
//            if (books.contains(book) && !borrowedBooks.contains(book)) {
//                books.remove(book);
//                borrowedBooks.add(book);
//                reader.addBook(book);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // выдача книги в читальный зал
//    public boolean giveBookForReadingRoom(Book book) {
//        if (catalog.containsKey(book.getTitle())) {
//            List<Book> books = catalog.get(book.getTitle());
//            if (books.contains(book) && !readingRoomBooks.contains(book)) {
//                books.remove(book);
//                readingRoomBooks.add(book);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // возврат книги из абонемента
//    public boolean returnBookFromBorrow(Book book, Reader reader) {
//        if (borrowedBooks.contains(book)) {
//            borrowedBooks.remove(book);
//            catalog.get(book.getTitle()).add(book);
//            reader.removeBook(book);
//            return true;
//        }
//        return false;
//    }

}
