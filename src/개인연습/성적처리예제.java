package 개인연습;

import java.util.Scanner;

public class 성적처리예제 {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println();
        grade = sc.nextInt();
        if (grade >= 90) {
            System.out.println("학점 A");
        } else if (grade >= 80) {
            System.out.println("학점 B");
        } else if (grade >= 70) {
            System.out.println("학점 C");
        }else if (grade >= 60) {
            System.out.println("학점 D");
        }else  {
            System.out.println("학점 F");
        }
    }
}