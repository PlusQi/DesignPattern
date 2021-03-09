package com.example.Iterator;

import java.util.ArrayList;

public class BookShelf implements IAggregate {

    private ArrayList books;

    public BookShelf(int initialSize) {
        this.books = new ArrayList(initialSize);
    }

    public Book getBookAt(int index) {
        return (Book) books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    /*private Book[] books;
    private int last;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }*/


    @Override
    public IIterator iIterator() {
        return new BookShelfIterator(this);
    }
}
