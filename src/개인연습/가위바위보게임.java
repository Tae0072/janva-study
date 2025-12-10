package 개인연습;

import java.util.Scanner;

public class 가위바위보게임 {

    final int SCISSOR = 0;
    final int ROCK = 0;
    final int PAPER = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위(0), 바위(1), 보(2) : ");
        int user = sc.nextInt();

        int computer = (int) (Math.random()*3);
        if (user == computer) {
            System.out.println("인간과 컴퓨터가 비겼음");
        }else if (user == (computer+1)%3) {
            System.out.println("인간: "+user+"컴퓨터: "+computer+"인간 승리");
        }else {
            System.out.println("인간: "+user+"컴퓨터: "+computer+"컴퓨터 승리");
        }
    }

}
