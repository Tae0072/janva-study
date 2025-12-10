package 개인연습;

import java.util.Scanner;

public class 섭씨화씨온도변환02 {
    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("===================================");
        System.out.println();
        System.out.print("번호를 선택하시오: ");
        Scanner sc = new Scanner(System.in);

        int a1=sc.nextInt();


        System.out.print("섭씨 온도를 입력하세요: ");
        int menu = sc.nextInt();
        if (menu == a1) {
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("화씨 온도: " + f);
        } else if (menu != a1) {
            // 화씨를 섭씨로 변환
            System.out.print("화씨 온도를 입력하세요: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("섭씨 온도: " + c);
        } else {
            // 잘못된 입력
            System.out.println("잘못된 번호입니다.");
        }


    }
}
