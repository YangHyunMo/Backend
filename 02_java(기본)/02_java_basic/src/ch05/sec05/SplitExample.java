package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        // 문자열 분리
        String[] arr = board.split(",");

        // 인덱스별로 읽기
        System.out.println("번호: " + arr[0]);
        System.out.println("제목: " + arr[1]);
        System.out.println("내용: " + arr[2]);
        System.out.println("성명: " + arr[3]);
        System.out.println();

        // for문 이용
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
