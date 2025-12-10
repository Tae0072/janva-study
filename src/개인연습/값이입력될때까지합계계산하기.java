package 개인연습;

import java.util.Scanner;

public class 값이입력될때까지합계계산하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, value = 0;

        while (value != -1) {
            sum = sum + value;
            System.out.println("정수를 입력하시오: ");
            value = sc.nextInt();
        }
        System.out.println("정수의 합은 " + sum + "입니다. ");
    }
}
