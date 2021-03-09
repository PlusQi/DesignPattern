package com.example.factorymethod.idcard;

import com.example.factorymethod.framework.Product;

public class IDCard extends Product {
    private String owner;

    /*
    * IDCard类的构造函数访问修饰符为default，使得idcard包外的类无法new出IDCard类的实例
    * 这样可以强迫外部必须通过IDCardFactory来生成IDCard的实例
    * */
    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
