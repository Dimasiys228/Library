package com.example.library.entity;

import java.util.Objects;

public class Book {
    private String bookName;
    private String autorName;
    private int numberOfListBooks;
    private int yearOfPublication;

    private int bookId;

    public Book(String bookName, String autorName, int numberOfListBooks) {
        this.bookName = bookName;
        this.autorName = autorName;
        this.numberOfListBooks = numberOfListBooks;
        this.yearOfPublication = yearOfPublication;
        this.bookId = bookId;
    }

    public Book() {

    }

    public int getBookid() {
        return bookId;
    }

    public void setBookId() {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutorName() {
        return autorName;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public int getNumberOfListBooks() {
        return numberOfListBooks;
    }

    public void setNumberOfListBooks(int numberOfListBooks) {
        this.numberOfListBooks = numberOfListBooks;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfListBooks == book.numberOfListBooks && yearOfPublication == book.yearOfPublication && bookId == book.bookId && Objects.equals(bookName, book.bookName) && Objects.equals(autorName, book.autorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, autorName, numberOfListBooks, yearOfPublication, bookId);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", autorName='" + autorName + '\'' +
                ", numberOfListBooks=" + numberOfListBooks +
                ", yearOfPublication=" + yearOfPublication +
                ", bookId=" + bookId +
                '}';
    }

    public String generateHtml() {

        return null;
    }
}

