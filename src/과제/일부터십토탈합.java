package 과제;

public class 일부터십토탈합 {
    public static void main(String[] args) {
        int a = 0;

        //누적
        // sum++, sum = sum +1
        //sum = sum+1;
        //sum = sum+2;
        //sum = sum+3;
        //.....sun = sum+10;

        for (int j = 0; j < 10; j++) {
            j++;
            a = a +j;
        }
        for (int i = 1; i <= 10; i++){
            a += i;
        }
        System.out.println(a);
    }

    int sum = 0;
    int n = 10;



}

