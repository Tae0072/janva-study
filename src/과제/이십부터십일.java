package 과제;

public class 이십부터십일 {
    public static void main(String[] args) {

        int a = -0;

        System.out.println(20);
        System.out.println(19);
        System.out.println(18);

        a--;
        System.out.println(18+a);
        a--;
        System.out.println(18+a);
        a--;
        System.out.println(18+a);

        for (int i = 0; i < 4; i++) {
            a--;
            System.out.println(18+a);
        }
        for (int i = 20; i >= 10; i--) {
            a--;
            System.out.println(i);
        }
    }
}
