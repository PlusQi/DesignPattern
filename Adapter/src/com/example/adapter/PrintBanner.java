package com.example.adapter;

/*
* Adapter（适配）：使用Adaptee角色的方法来满足Target角色，在类适配器中，Adapter角色通过继承来使用Adapter角色
* */
public class PrintBanner extends Banner implements IPrint {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
