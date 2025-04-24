package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] st1 = data1.split("&|,");
        for (String s : st1) System.out.println(s);
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st2 = new StringTokenizer(data2, "/");
        while (st2.hasMoreTokens()){
            String s = st2.nextToken();
            System.out.println(s);
        }
    }
}
