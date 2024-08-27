package hus.oop.design_patterns.lab10.adapter.playmp3;

public abstract class AdapterConvertMyFileToMp3 extends Mp3 {
    private final MyFile myFile;

    public AdapterConvertMyFileToMp3(MyFile myFile) {
        super();
        this.myFile = myFile;
    }

    public abstract String convertMyFileToMp3();

    @Override
    public String getFileName() {
        return convertMyFileToMp3();
    }

    public MyFile getMyFile() {
        return myFile;
    }
}
