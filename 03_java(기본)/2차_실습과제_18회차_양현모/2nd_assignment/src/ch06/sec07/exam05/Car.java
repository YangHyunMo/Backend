package ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){};

    Car(String model) {
        // 23라인 생성자 호출
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        // 23라인 생성자 호출
        this(model, color, 250);
    }

    // 공통 초기화 코드
    Car(String model, String color, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
