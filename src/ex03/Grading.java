package ex03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        double a1;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하시오: ");
        a1 = sc.nextDouble();
        if (a1 >=90)
            System.out.println("학점 A");
        else if (a1 >=80)
            System.out.println("학점 B");
        else if (a1 >=70)
            System.out.println("학점 C");
        else if (a1 >=60)
            System.out.println("학점 D");
        else
            System.out.println("학점 F");
    }
}
