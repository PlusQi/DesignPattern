package com.example.factorymethod;

import com.example.factorymethod.framework.Factory;
import com.example.factorymethod.framework.Product;
import com.example.factorymethod.idcard.IDCardFactory;
import com.example.factorymethod.newidcard.NewIDCardFactory;


public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("张三");
        Product card2 = factory.create("李四");
        Product card3 = factory.create("王五");
        card1.use();
        card2.use();
        card3.use();

        System.out.println("============带有编号的IDCard===============");
        Factory newFactory = new NewIDCardFactory();
        Product newCard1 = newFactory.create("张三");
        Product newCard2 = newFactory.create("李四");
        Product newCard3 = newFactory.create("王五");
        newCard1.use();
        newCard2.use();
        newCard3.use();
    }
}
