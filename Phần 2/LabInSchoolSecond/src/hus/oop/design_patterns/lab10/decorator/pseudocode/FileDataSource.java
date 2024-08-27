package hus.oop.design_patterns.lab10.decorator.pseudocode;

import java.io.*;

public class FileDataSource implements DataSource {
    private final String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.print("Write file with file name is " + fileName + " with data is " + data);
    }

    @Override
    public String readData() {
        return "Read file name with file name is " + fileName;
    }
}
