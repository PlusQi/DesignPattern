package com.example.singleton.test;

public class SingletonThreadMain extends Thread{
    public static void main(String[] args) {
        System.out.println("Start.");
        new SingletonThreadMain("A").start();
        new SingletonThreadMain("B").start();
        new SingletonThreadMain("C").start();
        System.out.println("End.");
    }

    public void run() {
        SingletonThread obj = SingletonThread.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

    public SingletonThreadMain(String name) {
        super(name);
    }
}
