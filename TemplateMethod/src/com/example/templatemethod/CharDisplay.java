package com.example.templatemethod;

public class CharDisplay extends AbstractDisplay {
    private char cd;

    public CharDisplay(char cd) {
        this.cd = cd;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(cd);
    } //显示构造函数接收的一个字符

    @Override
    public void close() {
        System.out.println(">>");
    }
}
