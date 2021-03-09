package com.example.singleton.test;

public class TicketMakerMain {
    public static void main(String[] args) {
/*        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();

        System.out.println(ticketMaker1.getNextTicketNumber());
        System.out.println(ticketMaker1.getNextTicketNumber());
        System.out.println(ticketMaker2.getNextTicketNumber());*/

        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End");
    }
}
