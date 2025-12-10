package ex05;

public class 정적블록 {
    static int number;
    static String s;
    static {
        number = 23;
        s = "Hello World!";
    }

    static void main() {
        System.out.println("number: "+"number");
        System.out.println("s: "+s);
    }
}
