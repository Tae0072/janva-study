package 과제;

public class 일부터십 {
    public static void main(String[] args) {

        int a = 1;

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        a++;
        System.out.println(a+2);
        System.out.println(a+3);

        for (int i = 0; i < 5; i++) {
            a++;
            System.out.println(a+3);

        }
        for (int i = 1; i <= 10; i++) {
            a++;
            System.out.println(i);

        }
    }
}
