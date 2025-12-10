package ex06.ch02;
//abstract class - 추상화 시킴
class Car {
    void run() {
//abstract in getPower(); - 추상화 메서드 - 무효화 시킴 - 상태 접근이 안됨 - 사라지진 않음, 작동만 안되게 만듬
    }
}

class Morning extends Car {
    void run() {
        System.out.println("모닝 달린다.");
    }
}

class Sonata extends Car {
    // 부모의 메서드를 재정의하면
    // 자식이 부모의 메서드를 오버라이드한다.
    // 오버라이드 : 무시하고 대신한다.
    void run() {
        System.out.println("쏘나타 달린다.");
    }
}

public class ExMeh01 {
    public static void main(String[] args) {
        Morning a1 = new Morning();//[Morning(v), Car]
        a1.run();

        Car a2 = new Sonata();//[Sonata, Car(v)]
        a2.run();
    }
}

