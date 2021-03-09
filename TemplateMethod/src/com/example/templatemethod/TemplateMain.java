package com.example.templatemethod;

public class TemplateMain {
    public static void main(String[] args) {
        AbstractDisplay ad1 = new CharDisplay('Q');
        AbstractDisplay ad2 = new StringDisplay("hello,world");
        AbstractDisplay ad3 = new StringDisplay("String3");

        ad1.display();
        ad2.display();
        ad3.display();
    }
}
