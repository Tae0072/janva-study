package algo;

import java.util.Random;

public class LottoApp {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r= new Random();
        int n = r.nextInt(45)+1;// 1~45
        System.out.println(n);
    }
}
