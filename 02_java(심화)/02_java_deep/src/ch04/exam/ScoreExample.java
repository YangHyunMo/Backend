package ch04.exam;

import java.util.Scanner;

public class ScoreExample {
    public static void main(String[] args) {
        boolean run = true;
        int num = 0;
        int[] score = null;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1){
                System.out.print("학생수> ");
                num = Integer.parseInt(scanner.nextLine());
                score = new int[num];
            } else if (choice == 2) {
                for (int i = 0; i < score.length; i++) {
                    System.out.print("score["+i+"]> ");
                    score[i] = Integer.parseInt(scanner.nextLine());
                }
            } else if (choice == 3) {
                for (int i = 0; i < score.length; i++) {
                    System.out.print("score["+i+"]: " + score[i] + " / ");
                }
            } else if (choice == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0;
                for (int i=0; i<score.length; i++){
                    max = (max < score[i]) ? score[i]: max;
                    sum += score[i];
                }
                avg = (double) sum / num;
                System.out.println("최고 점수: "+max);
                System.out.println("평균 점수: "+avg);
            } else if (choice == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료1");
    }
}
