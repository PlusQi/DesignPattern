package com.example.factorymethod.newidcard;

import com.example.factorymethod.framework.Factory;
import com.example.factorymethod.framework.Product;

import java.util.HashMap;

public class NewIDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<>();
    private int cardNo = 0;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new NewIDCard(owner, cardNo++);
    }

    @Override
    protected void registerProduct(Product product) {
        NewIDCard newIDCard = (NewIDCard)product;
        database.put(newIDCard.getCardNo(), newIDCard.getOwner());
    }

    public HashMap<Integer, String> getDatabase() {
        return database;
    }
}
