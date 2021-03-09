package com.example.factorymethod.newidcard;

import com.example.factorymethod.framework.Product;

public class NewIDCard extends Product {
    private String owner;
    private int cardNo;

    NewIDCard(String owner, int cardNo) {
        System.out.println("制作" + owner + "(" + cardNo + ")" + "的ID卡");
        this.owner = owner;
        this.cardNo = cardNo;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + cardNo + ")" + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public int getCardNo() {
        return cardNo;
    }
}
