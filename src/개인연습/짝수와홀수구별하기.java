package 개인연습;

import java.util.Scanner;

public class 짝수와홀수구별하기 {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하시오: ");
        number = sc.nextInt();

        if (number %2 == 0) {
            System.out.println("입력된 정수는 짝수 입니다.");
        }else {
            System.out.println("입력된 정수는 홀수 입니다.");
        }
    }
}
