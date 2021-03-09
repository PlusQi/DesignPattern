package com.example.singleton.test;

public class SingletonThread {
    private static SingletonThread singleton = null;
//    private static SingletonThread singleton = new SingletonThread();

    private SingletonThread() {
        System.out.println("生成了一个实例");
        slowdown();
    }

    public static SingletonThread getInstance() {
        if (null == singleton) {
            singleton = new SingletonThread();
        }
/*        if (null == singleton) {
            synchronized (SingletonThread.class) {
                if (null == singleton) {
                    singleton = new SingletonThread();
                }
            }
        }*/
        return singleton;
    }


    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
