package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>();

        queue.offer(new Message("mail", "홍길동"));
        queue.offer(new Message("sms", "신용권"));
        queue.offer(new Message("kakao", "감자바"));

        while (!queue.isEmpty()) {
            Message message = queue.poll();
            switch (message.command) {
                case "mail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sms":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;
                case "kakao":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
