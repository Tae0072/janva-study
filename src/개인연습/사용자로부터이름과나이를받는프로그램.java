package 개인연습;

import java.util.Scanner;

public class 사용자로부터이름과나이를받는프로그램 {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하시오: ");
        name = sc.nextLine();
        System.out.print("나이를 입력하시오: ");
        age = sc.nextInt();

        System.out.println(name+"님 안녕하세요! "+(age)+"살이시네요.");
    }
}
