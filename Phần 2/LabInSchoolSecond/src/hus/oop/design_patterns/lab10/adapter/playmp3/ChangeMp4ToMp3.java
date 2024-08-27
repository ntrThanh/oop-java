package hus.oop.design_patterns.lab10.adapter.playmp3;

public class ChangeMp4ToMp3 extends AdapterConvertMyFileToMp3 {
    public ChangeMp4ToMp3(MyFile myFile) {
        super(myFile);
    }

    @Override
    public String convertMyFileToMp3() {
        if (this.getMyFile().getFileName() == null) {
            System.out.print("Unknown file " + this.getMyFile().getFileName() + " ");
            return null;
        }

        if (this.getMyFile().getFileName().endsWith(".mp4")) {
            return this.getMyFile().getFileName().replace(".mp4", ".mp3");
        } else {
            System.out.print("Unknown file " + this.getMyFile().getFileName() + " ");
        }

        return null;
    }
}
