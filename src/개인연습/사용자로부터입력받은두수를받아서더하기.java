package 개인연습;

import java.util.Scanner;

public class 사용자로부터입력받은두수를받아서더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.print("첫번째 숫자를 입력하시오: ");
        x = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하시오: ");
        y = sc.nextInt();

        sum = x+y;
        System.out.println(sum);
    }
}
