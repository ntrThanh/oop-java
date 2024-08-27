package hus.oop.design_patterns.lab10.adapter.playmp3;

public class PlayMp3 {
    private final String FILE_NAME_END_WITH;

    public PlayMp3() {
        this.FILE_NAME_END_WITH = ".mp3";
    }

    public boolean playMp3(Mp3 mp3) {
        if (mp3.getFileName() == null) {
            return false;
        }
        return mp3.getFileName().endsWith(FILE_NAME_END_WITH);
    }
}
