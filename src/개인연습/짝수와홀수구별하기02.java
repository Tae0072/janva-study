package 개인연습;

import java.util.Scanner;

public class 짝수와홀수구별하기02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오: ");
        int number = sc.nextInt();

        if (number >0) {
            System.out.println("양수입니다.");
        }else if (number == 0) {
            System.out.println("0입니다.");
        }else {
            System.out.println("음수입니다.");
        }
    }
}
