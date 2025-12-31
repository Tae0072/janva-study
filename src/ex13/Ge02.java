package ex13;

//new할때 차입을 결정할 수 있게 해주는 제네릭
class Box2<T>{//<> 안에는 대문자로 넣어야함. 제네릭
    T data; // T는 Object타입으로 인식
}

public class Ge02 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2();
        box2.data = "안녕";

        int len = box2.data.length();
        System.out.println(len);

        Box2<Integer> box3 = new Box2();
        box3.data = 5;
        System.out.println(box3.data);
    }
}
