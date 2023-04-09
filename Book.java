package com.example.library.entity;

import java.util.Objects;

public class Book {
  private char bookName;
  private char autorName;
  private int numberOfListBooks;
  private int yearOfPublication;

    public Book(char bookName, char autorName, int numberOfListBooks, int yearOfPublication) {
        this.bookName = bookName;
        this.autorName = autorName;
        this.numberOfListBooks = numberOfListBooks;
        this.yearOfPublication = yearOfPublication;
    }

//    public Book(String title, String author, int year) {
//    }

    public char getBookName() {
        return bookName;
    }

    public void setBookName(char bookName) {
        this.bookName = bookName;
    }

    public char getAutorName() {
        return autorName;
    }

    public void setAutorName(char autorName) {
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


}
