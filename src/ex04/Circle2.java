package ex04;

public class Circle2 {
    int radius;

    public Circle2(int radius){
        this.radius = radius;
    }
    public Circle2(){
        this(0);
    }
    double getArea() {
        return  3.14*radius*radius;
    }
}
