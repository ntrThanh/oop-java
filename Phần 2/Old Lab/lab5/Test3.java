package lab5;

public class Test3 {
    public static void Hello(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                        System.out.println(i);
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.getLocalizedMessage();
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(500);
                        System.out.println("thread is running...");
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.getLocalizedMessage();
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
    }
}
