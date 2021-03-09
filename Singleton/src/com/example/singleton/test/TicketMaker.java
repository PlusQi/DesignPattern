package com.example.singleton.test;


public class TicketMaker {

    private static TicketMaker ticketMaker = new TicketMaker();

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    private int ticket = 1000;
    public synchronized int getNextTicketNumber() { //使用synchronized修饰保证在多线程环境下工作正常
        return ticket++;
    }
}
