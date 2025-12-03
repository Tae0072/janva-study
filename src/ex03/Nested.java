package ex03;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오: ");
        int nmber = sc.nextInt();

        if (nmber > 0)
            System.out.println("양수 입니다.");
        else if (nmber ==0 )
            System.out.println("0입니다.");
        else
            System.out.println("음수입니다.");
    }
}
