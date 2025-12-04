package algo;

import java.util.Arrays;

// 4찾기
public class BSearch02 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 8, 6};

        //1. 정렬 {1,2,3,4,6,8,10}
        Arrays.sort(arr);

        int target = 10;

        //2. 검색
        if (4==arr[2]){
            System.out.println("4를 찾았습니다.");
        }

        if (4<arr[2]) { // false
            System.out.println("4는 작아요");

            if (4 == arr[1]){
                System.out.println("4를 찾았습니다.");
            }
        }else {
            System.out.println("4은 커요");

            if (4 == arr[3]){
                System.out.println("4을 찾았습니다.");
            }else {
                System.out.println("arr[4]번지에 4이 있습니다.");
            }
        }

        System.out.println("main끝");
    }
}
