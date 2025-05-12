package ch18.sec03.exam01;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/study/Back/13_java(기본)/13_java_basic/test1.db");

            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
