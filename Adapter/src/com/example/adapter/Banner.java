package com.example.adapter;

/*
 * Adaptee（被适配）：持有特定方法的角色
 * */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("[" + string + "]");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
