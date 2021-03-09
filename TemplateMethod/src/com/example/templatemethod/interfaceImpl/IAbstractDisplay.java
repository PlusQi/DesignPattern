package com.example.templatemethod.interfaceImpl;

public interface IAbstractDisplay {
    void open();
    void print();
    void close();

    default void disPlay() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
