package com.example.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("BookA"));
        bookShelf.appendBook(new Book("BookB"));
        bookShelf.appendBook(new Book("BookC"));
        bookShelf.appendBook(new Book("BookD"));

        bookShelf.appendBook(new Book("BookE"));
        bookShelf.appendBook(new Book("BookF"));

        IIterator it = bookShelf.iIterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
