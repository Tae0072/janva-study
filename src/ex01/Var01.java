package ex01;

public class Var01 {
    public static void main(String[] args) {
   byte a1 = 100;
   //바이트 = 8비트로 구성. -127~127까지 입력가능
   int a2 = 2000000000;
   //인트 = 4바이트 = 32비트로 구성. -21억~21억까지 가능.
   double a3 = 1.5;
   //더블 = 8바이트 = 64비트로 구성 = 요즘 컴퓨터. -21억~21억까지 가능. +소숫점 까지 가능
   boolean a4 = true;
   //불린 = 1바이트로 구성. 진실 혹은 거짓으로만 입력 가능
   System.out.println(a1);
   System.out.println(a2);
   System.out.println(a3);
   System.out.println(a4);

    }
}
