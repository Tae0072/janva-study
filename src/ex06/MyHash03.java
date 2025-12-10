package ex06;

public class MyHash03 {
    public static void main(String[] args) {
        char[] arr = {'A','B','C'};

        int h = 0;

        //1. 문자를 숫자로 변경
        int n = arr[0];//65
        System.out.println(n);

        h=h*31+n;//65

        //2.
        n = arr[1];//65
        h=h*31+n;//h=2081

        //3.
        n = arr[2];//
        h=h*31+n;//

        System.out.println(h);
    }
}
