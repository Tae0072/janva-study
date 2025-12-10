package 개인연습;

public class 중감복합대입연산자 {
    public static void main(String[] args) {
        int x = 1, y = 1;

        int a = x++;
        int b = ++y;
        System.out.println("a=" + a + ", b=" + b);

        int c = 100, d = 200;
        c += 10;
        d /= 10;
        System.out.println("c=" + c + ", d=" + d);
    }
}
