package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10;
        String str = null;
        System.out.println("총 문자 수: " + str.length() );
    }
}
// 배열이 null인데 인덱스 값을 찾으려고 함.