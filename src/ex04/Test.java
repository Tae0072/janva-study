package ex04;

class A {
    private int a;
    int b;
    public int c;
}
public class Test {
    public static void main(String[] args) {

        A obj = new A();

        //obj.a= 10; class 가 달라서 접근 할 수 없다.
        obj.b = 20;
        obj.c = 30;
    }
}
