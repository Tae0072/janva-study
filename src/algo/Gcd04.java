package algo;
//ctrl+d(한줄 복사)
/**
 * 6의 약수를 구하고, 8의 약수를 구해서 최대 공약수를 찾기
 * (1)비즈니스 이해(6을 1~6까지 나눠서 떨어지는 약수 - 배열에 담기)
 * (8을 1~8까지 나눠서 떨어지는 약수 - 배열에 담기)
 * (2)arr1 = {1,2,3,6}
 * (3)arr2 = {1,2,4,8}
 * (4)두 배열을 비교해서 최대공약수 찾기
 * 후보 1 => 후보 2=> int result
 */
class Gcd04 {

    //책임 : 약수를 구해서 리턴하기
    // 공급
    static int[] 약수구하기(int a) {
        // main에서 a 값을 입력하면 @ 식이 열려 활성화
        int[] arr1 = new int[a];
        int n1 = 0;
        int k1 = 1;
        // 1. 6의 약수 채우기====================================================ctrl + Alt + l = 전체 정렬
        // [1][2][3][6][0][0]
        for (int i = 0; i < a; i++) {
            if (a % k1 == 0) {
                arr1[n1] = k1;
                n1++;
            }
            k1++;
        }
        return arr1;
    }//@식이 종료

    static int 최대공약수구하기(int[] arr1, int[] arr2) {
        int result = 0;
        int c = 0;

        for (int i = 0; i < 4; i++) {
            if (arr1[c] == arr2[0]) result = arr1[c];
            if (arr1[c] == arr2[1]) result = arr1[c];
            if (arr1[c] == arr2[2]) result = arr1[c];
            if (arr1[c] == arr2[3]) result = arr1[c];
            c++;
        }

        return result;
    }

    public static void main(String[] args) {
       //1.약수 구하기
        int[] arr1 = 약수구하기(6); // [1][2][3][6][0][0]
        int[] arr2 = 약수구하기(8); // [1][2][4][8][0][0][0][0]

        //2. 최대 공약수 구하기
        int result = 최대공약수구하기(arr1, arr2);

        //3. 결과 확인
        System.out.println("최대공약수"+result);


        System.out.println("메인끝");

        }//and of main
    }




