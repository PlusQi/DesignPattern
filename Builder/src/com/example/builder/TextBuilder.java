package com.example.builder;

/**
 * TextBuilder是Builder的子类，使用纯文本编写文档，并返回字符串
 */
public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer(); // 文档内容保存在该字段

    @Override
    public void makeTitle(String title) { // 纯文本的标题
        buffer.append("====================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) { // 纯文本的字符串
        buffer.append('^' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) { // 纯文本的条目
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() { // 完成文档
        buffer.append("=========================");
    }

    public String getResult() { // 完成的文档
        return buffer.toString();
    }
}

