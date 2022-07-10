package com.example.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() { // 编写文档
        builder.makeTitle("Greeting"); // 标题
        builder.makeString("从早上到下午"); // 字符串
        builder.makeItems(new String[] { // 条目
                "早上好。",
                "下午好。",
        });
        builder.makeString("晚上"); // 其他字符串
        builder.makeItems(new String[] { // 其他条目
                "晚上好。",
                "晚安。",
                "再见。",
        });

        builder.close(); // 完成文档
    }
}
