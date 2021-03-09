package com.example.adapter;

/*
* Client（请求者）：负责使用Target角色所定义的方法进行具体处理
* */
public class AdampterMain {
    public static void main(String[] args) {
        //使用继承的示例
        IPrint iPrint = new PrintBanner("Hello");
        iPrint.printWeak();
        iPrint.printStrong();
        System.out.println("========================");

        //使用委托的示例程序
        Print print = new PrintBanner2("Hello");
        print.printWeak();
        print.printStrong();
        System.out.println("========================");

        PrintBanner pb = new PrintBanner("hello");
        print.printWeak();
        print.printStrong();


    }
}
