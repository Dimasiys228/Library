package com.example.library.entity;

import java.util.Objects;

public class Reader {
    private int readerId;
    private String readerName;
    private String readerFemale;

    public Reader(int readerId, String readerName, String readerFemale) {
        this.readerId = readerId;
        this.readerName = readerName;
        this.readerFemale = readerFemale;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderFemale() {
        return readerFemale;
    }

    public void setReaderFemale(String readerFemale) {
        this.readerFemale = readerFemale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return readerId == reader.readerId && Objects.equals(readerName, reader.readerName) && Objects.equals(readerFemale, reader.readerFemale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readerId, readerName, readerFemale);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", readerName='" + readerName + '\'' +
                ", readerFemale='" + readerFemale + '\'' +
                '}';
    }

    // TODO: 29.03.2023
//        static void bookSearch(String... varg) {
//            String title = varg[0], author = varg.length > 1 ? varg[1] : "";
//            boolean found = false;
//            for (int i = 0; i < Catalog.bookSearch(); i++) {
//                Book book = bookList.get(i);
//                if (book.getBookName().equals(title)
//                        && (author.isEmpty() || book.getAutorName().getName().equals(author))) {
//                    System.out.printf("\"%s\" found at: %d%n", title, i);
//                    found = true;
//
//    static void bookOrder(){ // TODO: 29.03.2023
//
//    }
//}

}