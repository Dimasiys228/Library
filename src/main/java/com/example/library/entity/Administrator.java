package com.example.library.entity;

import java.util.ArrayList;
public class Administrator {
    private ArrayList<Librarian> librarians;
    private ArrayList<Reader> readers;
    public Administrator() {
        this.librarians = new ArrayList<Librarian>();
        this.readers = new ArrayList<Reader>();
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public void removeLibrarian(Librarian librarian) {
        librarians.remove(librarian);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void removeReader(Reader reader) {
        readers.remove(reader);
    }
}
