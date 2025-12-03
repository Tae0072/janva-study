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
class Gcd03 {

    static void 약수구하기(int a) {
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
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        int[] arr1 = new int[6]; // [1][2][3][6][0][0]
        int[] arr2 = new int[8]; // [1][2][4][8][0][0][0][0]

        int n1 = 0;
        int n2 = 0;
        int k1 = 1;
        int k2 = 1;
        // 1. 6의 약수 채우기====================================================ctrl + Alt + l = 전체 정렬
        // [1][2][3][6][0][0]
        for (int i = 0; i < a; i++) {
            if (a % k1 == 0) {
                arr1[n1] = k1;
                n1++;
            }
            k1++;
        }

        // 1. 8의 약수 채우기====================================================ctrl + Alt + l = 전체 정렬
        //[1][2][4][8][0][0][0][0]
        for (int i = 0; i < b; i++) {
            if (b % k2 == 0) {
                arr2[n2] = k2;
                n2++;
            }
            k2++;
        }
            //3. 최대 공약수 구하기
            int result = 0;
            int c = 0;

            for (int i = 0; i < 4; i++) {
                if (arr1[c] == arr2[0]) result = arr1[c];
                if (arr1[c] == arr2[1]) result = arr1[c];
                if (arr1[c] == arr2[2]) result = arr1[c];
                if (arr1[c] == arr2[3]) result = arr1[c];
                c++;
            }

            System.out.println("최대공약수는" + result);

            System.out.println("메인끝");

        }//and of main
    }




