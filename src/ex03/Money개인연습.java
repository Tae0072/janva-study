package ex03;

import java.util.Scanner;

public class Money개인연습 {

    public static void main(String[] args) {
        int orderPrice = 15000; // 주문 금액
        int shippingFee = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하시오: ");
        System.out.println("=================");

        if (orderPrice >= 20000) {
            shippingFee = 0;
        } else {
            shippingFee = 3000;
        }

        System.out.println("배송비: " + shippingFee + "원");


    }}