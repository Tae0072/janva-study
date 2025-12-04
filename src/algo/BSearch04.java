package algo;

import java.util.Arrays;

// 3찾기
public class BSearch04 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 0, 11};//7개

        //1. 정렬 {0, 1, 2, 3, 4, 10, 11}
        Arrays.sort(arr);

        int target = 11;
        int mid = arr.length / 2;//


        //2. 검색
        if (target == arr[mid]) {//0, 1, 2, {3}, 4, 10, 11
            System.out.println(target + "를 찾았습니다.");
            return;
        }
        if (target > arr[mid]) {//0, 1, 2, 3, 4, {10}, 11 true
            mid = 5;
        }
        if (target < arr[mid]) {//0, {1}, 2, 3, 4, 10, 11 fasle
            mid = 1;
        }
        if (target == arr[mid]) {//0, 1, 2, 3, 4, {10}, 11
            System.out.println(target + "를 찾았습니다.");
            return;
        }
        if (target > arr[mid]) {//0, 1, 2, 3, 4, 10, {11} true
            mid = 6;
        }
        if (target < arr[mid]) {//0, 1, 2, 3, {4}, 10, 11 fasle
            mid = 0;
        }
        if (target == arr[mid]) {//0, 1, 2, 3, 4, 10, {11}
            System.out.println(target + "를 찾았습니다.");
            return;
        }

            System.out.println("main끝");
        }
    }
