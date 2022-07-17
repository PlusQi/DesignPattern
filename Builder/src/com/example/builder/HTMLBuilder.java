package com.example.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HTMLBuilder是Builder类的子类，他的功能是使用HTML编写文档，最后返回HTML文件的名字
 */
public class HTMLBuilder extends Builder {
    private String fileName; // 文件名
    private PrintWriter writer; // 用于编写文件的PrintWriter


    @Override
    public void makeTitle(String title) { // 生成HTML文件的标题
        fileName = title + ".html"; // 将标题作为文件名
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        // 输出标题
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) { // HTML文件中的字符串
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) { // HTML文件中的条目
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
