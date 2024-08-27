package hus.oop.design_patterns.lab10.adapter.playmp3;

public class App {
    public static void main(String[] args) {
        PlayMp3 playMp3 = new PlayMp3();

        MyFile file = new MyFile("NoiNayCoAnh.mp4");
        MyFile file1 = new MyFile("LacTroi.mp4");
        MyFile file2 = new MyFile("MoHo.mp5");
        Mp3 mp3 = new Mp3("XinAnhDung.mp3");

        Mp3 mp3File = new ChangeMp4ToMp3(file);
        Mp3 mp3File1 = new ChangeMp4ToMp3(file1);
        Mp3 mp3File2 = new ChangeMp4ToMp3(file2);

        System.out.println((playMp3.playMp3(mp3)) ? "Open Mp3 " + mp3.getFileName() : "");
        System.out.println((playMp3.playMp3(mp3File)) ? "Open Mp3 " + mp3File.getFileName() : "");
        System.out.println((playMp3.playMp3(mp3File1)) ? "Open Mp3 " + mp3File1.getFileName() : "");
        System.out.println((playMp3.playMp3(mp3File2)) ? "Open Mp3 " + mp3File2.getFileName() : "");
    }
}
