package lab5;

import java.awt.event.*;

public class Test implements KeyListener {
    public Test() {
        start();
    }

    public static StringBuilder stringKey = new StringBuilder("");

    @Override
    public void keyTyped(KeyEvent e) {
        char character = e.getKeyChar();
        logCharacter(character);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        // Tạo một thread mới để chạy chương trình chính
        Thread backgroundThread = new Thread(() -> {
            // Thực hiện các công việc cần thiết trong chương trình chạy ngầm ở đây
            int i = 0;
            while (true) {
                System.out.println(i);

                i++;
                // Đặt thời gian ngủ cho thread để tránh tài nguyên CPU quá tải
                // try {
                // Thread.sleep(1000);
                // } catch (InterruptedException e) {
                // // TODO Auto-generated catch block
                // e.printStackTrace();
                // } // Ví dụ: Chạy mỗi giây
                // System.out.println("Chương trình đang chạy ngầm...");
            }
        });

        // Bắt đầu chạy thread
        backgroundThread.start();

        // Thực hiện các công việc khác trong chương trình chính ở đây
        System.out.println("Chương trình chính đang chạy...");

        // Đợi thread chạy ngầm kết thúc (nếu cần)
        // backgroundThread.join();
    }

    private void logCharacter(char character) {
        stringKey.append(character + " ");
        System.out.println(character + " ");
    }

    private void start() {
        // Tạo một đối tượng JFrame để có thể thêm KeyListener
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.addKeyListener(this);
        frame.setUndecorated(true);

        // Hiển thị frame
        frame.setVisible(true);

        // Chạy ẩn trong nền
        frame.setOpacity(0.0f);
    }
}
