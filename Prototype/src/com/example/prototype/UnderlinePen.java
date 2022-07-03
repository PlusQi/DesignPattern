package com.example.prototype;

import java.nio.charset.StandardCharsets;

public class UnderlinePen implements Product{
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes(StandardCharsets.UTF_8).length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(ulChar);
        }

        System.out.println("");
        System.out.println(ulChar + " " + s + " " + ulChar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(ulChar);
        }

        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
