package 개인연습;

import java.util.Scanner;

public class 형변환실습하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("초를 압력하기오:");
        int time = sc.nextInt();
        int sec = (time%60);
        int min = (time/60);

        System.out.println(time+"초는 "+min+"분 "+sec+"초입니다.");
    }
}
