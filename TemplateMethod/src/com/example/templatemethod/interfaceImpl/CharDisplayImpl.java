package com.example.templatemethod.interfaceImpl;

public class CharDisplayImpl implements IAbstractDisplay{
    private char cd;

    public CharDisplayImpl(char cd) {this.cd = cd;}

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(cd);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
