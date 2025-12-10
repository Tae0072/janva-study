package ex05;

public class 정적변수사용하기 {
    private String topping;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public 정적변수사용하기(String toppings) {
        this.topping = toppings;
        count++;

    }
        static void main () {
            정적변수사용하기 p1 = new 정적변수사용하기("Super Supreme");
            정적변수사용하기 p2 = new 정적변수사용하기("Cheese");
            정적변수사용하기 p3 = new 정적변수사용하기("Pepperoni");
            int n = 정적변수사용하기.count;
            System.out.println("지금까지 판매된 피자 개수 = "+n);
        }
    }

