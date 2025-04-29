package ch14.exam;

import java.awt.*;

public class MusicRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 6; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);} catch (Exception e) {}
                }
            }
        };

        thread.start();

        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(500);} catch (Exception e) {}
        }
    }
}
