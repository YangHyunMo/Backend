package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int index = subject.indexOf("프로그래밍");
        System.out.println(index);

        // 문자열 포함 여부
        int java = subject.indexOf("자바");
        if (java == 0){
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련된 책이 아니군요.");
        }

        // 문자열이 단순히 포함되어 있는지만 확인
        boolean result = subject.contains("자바");
        if (result == true) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련된 책이 아니군요.");
        }
    }
}
