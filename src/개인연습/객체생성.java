package 개인연습;

import ex04.Circle;

public class 객체생성 {
    public static void main(String[] args) {
        Circle obj;
        obj = new Circle();
        obj.radius = 100;
        obj.color = "blue";
        double area = obj.getArea();
        System.out.println("원의 면적 = " +area);
    }
}
