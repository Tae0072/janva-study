package algo;

/**
 *  1~00까지의 수에서 2의 배수를 출력하시오.
 *  (1) 비지니스
 *  (2)샘플링
 *  (3)노가다
 *  (4) 패턴
 */
public class T01 {
    public static void main(String[] args) {
        int num = 1;
        String result = "2의배수입니다.";

        //num 1
        if (num%2 == 0) {
            result = "2의 배수가 맞습니다.";
        }else {
            result = "2의 배수가 아닙니다.";
        }
        System.out.println(num+" 는 "+result);
        num++;

        //num 2
        if (num%2 == 0) {
            result = "2의 배수가 맞습니다.";
        }else {
            result = "2의 배수가 아닙니다.";
        }
        System.out.println(num+" 는 "+result);
        num++;

        //num 3
        if (num%2 == 0) {
            result = "2의 배수가 맞습니다.";
        }else {
            result = "2의 배수가 아닙니다.";
        }
        System.out.println(num+" 는 "+result);
        num++;

        //num 4
        if (num%2 == 0) {
            result = "2의 배수가 맞습니다.";
        }else {
            result = "2의 배수가 아닙니다.";
        }
        System.out.println(num+" 는 "+result);
        num++;


    }
}
