package algo;

/**
 * 12의 약수를 출력하시오.
 * (1)비즈니스 이해(12를 1부터 12까지 다 나눠서 나누어 떨어지는 약수)
 * (2)샘플링 6의 약수 구하기
 * (3)노가다
 * (4)패턴 찾기
 */
public class Divisor01 {
    public static void main(String[] args) {
        int n = 1;
        String result;
        //1
        if (12%n == 0) {
            result = "맞음";
        } else {
            result = "아님";
        }
        System.out.println(n+"은 약수 "+result);
        n++;

        //2
        if (12%n == 0) {
            result = "맞음";
        } else {
            result = "아님";
        }
        System.out.println(n+"은 약수 "+result);
        n++;

        //3
        if (12%n == 0) {
            result = "맞음";
        } else {
            result = "아님";
        }
        System.out.println(n+"은 약수 "+result);
        n++;

        //4
        if (12%n == 0) {
            result = "맞음";
        } else {
            result = "아님";
        }
        System.out.println(n+"은 약수 "+result);
        n++;

        //5
        if (12%n == 0) {
            result = "맞음";
        } else {
            result = "아님";
        }
        System.out.println(n+"은 약수 "+result);
        n++;

        //6
        if (12%n == 0) {
            result = "맞음";
        } else {
            result = "아님";
        }
        System.out.println(n+"은 약수 "+result);
        n++;

        //7
        if (12%n == 0) {
            result = "맞음";
        } else {
            result = "아님";
        }
        System.out.println(n+"은 약수 "+result);
        n++;

    }
}
