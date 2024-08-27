package hus.oop.design_patterns.lab10.adapter.playmp3;

public class MyFile {
    private String fileName;

    public MyFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
