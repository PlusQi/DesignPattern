package com.example.adapter.FileIO;

import java.io.IOException;

public class FileIOMain {
    public static void main(String[] args) {
        IFileIO f = new FileProperties();
        try {
            f.readFromFile("Adapter/src/com/example/adapter/FileIO/file.txt");
            f.setValue("year", "2020");
            f.setValue("month", "10");
            f.setValue("day", "10");
            f.writeToFile("Adapter/src/com/example/adapter/FileIO/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
