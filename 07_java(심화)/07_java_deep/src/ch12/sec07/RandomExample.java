package ch12.sec07;

import java.util.Random;
import java.util.Arrays;

public class RandomExample {
    public static void main(String[] args) {
        /// 선택한 번호
        int[] selectNumber = new int[6];
        Random random = new Random();
        System.out.print("선택번호: ");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45)+1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        /// 당첨번호
        int[] luckyNumber = new int[6];
        random = new Random();
        System.out.print("당첨번호: ");
        for (int i = 0; i < 6; i++) {
            luckyNumber[i] = random.nextInt(45)+1;
            System.out.print(luckyNumber[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNumber);
        Arrays.sort(luckyNumber);
        boolean isLucky = Arrays.equals(selectNumber, luckyNumber);
        System.out.print("당첨여부: ");
        if (isLucky){
            System.out.print("1등 축하");
        } else {
            System.out.print("아쉽네요.");
        }
    }
}
