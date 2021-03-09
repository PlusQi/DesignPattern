package com.example.templatemethod.interfaceImpl;

public class InterfaceImplMain {
    public static void main(String[] args) {
        IAbstractDisplay ad1 = new CharDisplayImpl('Q');
        IAbstractDisplay ad2 = new StringDisplayImpl("hello,world");
        IAbstractDisplay ad3 = new StringDisplayImpl("String3");

        ad1.disPlay();
        ad2.disPlay();
        ad3.disPlay();
    }
}
