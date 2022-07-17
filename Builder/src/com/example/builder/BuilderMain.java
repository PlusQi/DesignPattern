package com.example.builder;

public class BuilderMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("Plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("Html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "文件编写完成。");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: Java Main Plain      编写纯文本文档");
        System.out.println("Usage: Java Main Html      编写HTML文档");
    }
}
