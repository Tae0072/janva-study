package ex06.example;

public class Shape {
    void draw(){
        System.out.println("도형을 그립니다.");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("원을 그립니다.");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("사각형을 그립니다.");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("삼각형을 그립니다.");
    }
}
class ShapeApp{
    public static void main(String[] args) {
        Shape a1 = new Circle();
        a1.draw();

        Shape a2 = new Rectangle();
        a2.draw();

        Shape a3 = new Triangle();
        a3.draw();
    }
}