package hus.oop.design_patterns.lab10.adapter.playmp3;

public class Mp3 {
    private String fileName;

    public Mp3(String fileName) {
        this.fileName = fileName;
    }

    public Mp3() {
    }

    public String getFileName() {
        return fileName;
    }
}
