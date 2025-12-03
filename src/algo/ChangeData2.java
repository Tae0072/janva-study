package algo;

public class ChangeData2 {
    public static void main(String[] args) {
        //{1,2,3,4,5,6,7} -> {7,6,5,4,3,2,1} //5일때는 3번, 7일때는 4번, 10일때는 5번 돈다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int temp;
        int a=arr.length-1;
        int b=0;
        int row = arr.length/2;

        // 1. arr[0]번지와 arr[6]번지 스왑
        for (int i = 0; i < row; i++) {
            temp = arr[a]; //temp =3, {1,2,3} - 수학 연산
            arr[a] = arr[b]; //temp = 3, {1,2,1}
            arr[b] = temp; //temp = 3, {3,2,1}
            a--;
            b++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        }
    }

