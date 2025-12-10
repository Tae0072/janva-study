package 개인연습;

import java.util.Scanner;

public class 섭씨화씨온도변환 {
    public static void main(String[] args) {

        int a = 1;
        int b= 2;
        int  f =100;
        double c_temp = 5.0/9 * (f - 32);

        System.out.println("===================================");
        System.out.println(a+". 화씨->섭씨");
        System.out.println(b+". 섭씨->화씨");
        System.out.println("===================================");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("번호를 선택하시오: "+a);
        System.out.println("화씨온도를 입력하시오: "+f);





        System.out.println("섭씨온도는 "+ c_temp);
    }
}
