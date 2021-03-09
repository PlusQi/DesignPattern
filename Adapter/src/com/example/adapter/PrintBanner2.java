package com.example.adapter;

/*
 * Adapter（适配）：使用Adaptee角色的方法来满足Target角色，在对象适配器中，Adapter角色通过委托来使用Adapter角色
 * */
public class PrintBanner2 extends Print {
    private Banner banner;

    public PrintBanner2(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
