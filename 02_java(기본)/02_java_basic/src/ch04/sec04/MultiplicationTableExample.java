package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int dan = 2; dan<=9; dan++) {
            System.out.println("***" + dan + "***");
            for (int i=1; i<=9; i++) {
                System.out.println(dan + " x " + i + " = " + dan*i);
            }
        }
    }
}

// 가로로 작성하는 것 만들어보기