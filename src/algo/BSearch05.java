package algo;

import java.util.Arrays;

// 3찾기
public class BSearch05 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 0, 11,5,6,7,8,9};//12개

        //1. 정렬 {0,1,2,3,4,5,6,7,8,9,10,11}
        Arrays.sort(arr);

        int target = 11;
        int mid = arr.length / 2;//


        //2. 검색
        if (target == arr[mid]) {//{0,1,2,3,4,{5},6,7,8,9,10,11}
            System.out.println(target + "를 찾았습니다.");
            return;//star=6,end=11
        }
        if (target > arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11 true
            mid = 8;//star=6,end=11
        }
        if (target < arr[mid]) {//0,1,2,3,4,5,6,7,8,9,10,11fasle
            mid = 2;//star=0,end=4
        }
        if (target == arr[mid]) {//0, 1, 2, 3, 4, {10}, 11
            System.out.println(target + "를 찾았습니다.");
            return;
        }
        if (target > arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11 true
            mid = 9;
        }
        if (target < arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11 fasle
            mid = 1;
        }
        if (target == arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11
            System.out.println(target + "를 찾았습니다.");
            return;
        }
        if (target > arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11 true
            mid = 10;
        }
        if (target < arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11 fasle
            mid = 0;
        }
        if (target == arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11
            System.out.println(target + "를 찾았습니다.");
            return;
        }if (target > arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11 true
            mid = 11;
        }
        if (target < arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11 fasle
            mid = 0;
        }
        if (target == arr[mid]) {//0,1,2,3,4,5,6,7,{8},9,10,11
            System.out.println(target + "를 찾았습니다.");
            return;
        }

            System.out.println("main끝");
        }
    }
