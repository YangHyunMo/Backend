package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample2 {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/study/Back/13_java(심화)/13_java_deep/images");
        File file0 = new File("C:/study/Back/13_java(심화)/13_java_deep/chapter06.sql");
        File file1 = new File("C:/study/Back/13_java(심화)/13_java_deep/file1.txt");
        File file2 = new File("C:/study/Back/13_java(심화)/13_java_deep/file2.txt");
        File file3 = new File("C:/study/Back/13_java(심화)/13_java_deep/file3.txt");
        File file4 = new File("C:/study/Back/13_java(심화)/13_java_deep/Hello.class");
        File file5 = new File("C:/study/Back/13_java(심화)/13_java_deep/Hello.java");

        if (dir.exists() == false) {dir.mkdirs();}
        if (file0.exists() == false) {file0.createNewFile();}
        if (file1.exists() == false) {file1.createNewFile();}
        if (file2.exists() == false) {file2.createNewFile();}
        if (file3.exists() == false) {file3.createNewFile();}
        if (file4.exists() == false) {file4.createNewFile();}
        if (file5.exists() == false) {file5.createNewFile();}

        File temp = new File("C:/study/Back/13_java(심화)/13_java_deep");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10d%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}