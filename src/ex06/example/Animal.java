package ex06.example;

import ex04.game.Zealot;

import java.util.Arrays;

public class Animal {
    void sound() {
        System.out.println("울음소리");
    }     // 동물 기본 소리
    void introduce() {
        System.out.println("나는"+"입니다.");
    } // 자기소개
    void act(){
        System.out.println("를 합니다.");
    }       // 동물의 추가 행동
}
class Dog extends Animal{
    String name;
    Dog(String name) {
        this.name = name;
    }
    void sound() {
        System.out.println("멍멍!");
    }     // 동물 기본 소리
    void introduce() {
        System.out.println("제 이름은 "+name+" 입니다.");
    } // 자기소개
    void act(){
        System.out.println("꼬리를 흔든다.");
    }       // 동물의 추가 행동
}
class Cat extends Animal{
    String name;
    Cat(String name) {
        this.name = name;
    }
    void sound() {
        System.out.println("야옹~");
    }     // 동물 기본 소리
    void introduce() {
        System.out.println("제 이름은 "+name+" 입니다.");
    } // 자기소개
    void act(){
        System.out.println("햘퀸다.");
    }       // 동물의 추가 행동
}
class Duck extends Animal{
    String name;
    Duck(String name) {
        this.name = name;
    }
    void sound() {
        System.out.println("꽥꽥");
    }     // 동물 기본 소리
    void introduce() {
        System.out.println("제 이름은 "+name+" 입니다.");
    } // 자기소개
    void act(){
        System.out.println("헤엄친다.");
    }       // 동물의 추가 행동
}
class Zookeeper {
    void action(Animal a) {
        a.introduce();
        a.sound();
        a.act();
        // 구현하기
        System.out.println();
    }
}
class ZookeeperApp {
    public static void main(String[] args) {
        Animal[] all = new Animal[3];

        Animal a1 = new Dog("콩이");
        Animal a2 = new Cat("나비");
        Animal a3 = new Duck("덕돌이");

        all[0] = a1;
        all[1] = a2;
        all[2] = a3;

        Zookeeper zz = new Zookeeper();

        for (Animal a: all ){
            zz.action(a);
        }
    }
}

