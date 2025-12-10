package 개인연습;

import java.util.Scanner;

public class 팩토리얼계산하기 {
    public static void main(String[] args) {
        long fact = 1;
        int n;

        System.out.println("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            fact = fact * i;
            System.out.printf("%d!은 %d입니다.\n" , n, fact);
        }

    }
}
