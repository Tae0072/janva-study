package algo;


import java.util.Arrays;

// 11찾기
public class BSearch07 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3, 0, 7, 6, 8, 9, 10}; //11개 log11 ->  3~4회 안에 끝남

        Arrays.sort(arr);// {0,1,2,3,4,5,6,7,8,9,10}

        System.out.println("안녕");

        int target = 6;
        int startIndex = 0;
        int endIndex = 10;
        int mid = (endIndex - startIndex)/2;

        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(1라운드): " + arr[mid]);//5번지
        }

        startIndex = mid+1;
        mid = (endIndex - startIndex)/2 + startIndex; //-8번지

        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);//8번지
        }
        // {0,1,2,3,4,5,--------x 6,7,[8],9,10}  s=6,e=7
        endIndex = mid -1;//목표 값이 작아질때만 엔드 인덱스를 감소
        mid = (endIndex - startIndex)/2 + startIndex; //-6번지
        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);
        }
    }
}