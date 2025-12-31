package algo;

import java.util.Random;

public class Lotto04 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2-1. 첫번째 추첨 [랜던숫자 하나][][][][][] - 픽스 -9
        n = rand.nextInt(45) + 1;
        arr[0] = n;

        //2-2. 두번째 추첨 [랜던숫자 하나][랜던숫자 둘][][][][] - 중복 x
        while (true) {
            n = rand.nextInt(45) + 1; //<-첫번째와 같은 숫자를 뽑음 -15
            if (arr[0] != n) {
                arr[1] = n;
                break;
            }
        }

        //9,9,15,15,20 으로 가정하고 짜보기
        //2-3. 세번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][][][]
        n = rand.nextInt(45) + 1; //- 9
        if (arr[0] == n) {

        }
        n = rand.nextInt(45) + 1; //- 9
        if (arr[0] == n) {

        }
        n = rand.nextInt(45) + 1; //- 15
        if (arr[0] == n) {

        }
        if (arr[1] == n) {

        }
        n = rand.nextInt(45) + 1; //- 20
        if (arr[0] == n) {

        }//- 20
        if (arr[1] == n) {

        }
        arr[2] = n;


        //2-4. 첫번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][][]
        n = rand.nextInt(45) + 1;
        arr[3] = n;

        //2-5. 두번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][랜던숫자 다섯][]
        n = rand.nextInt(45) + 1;
        arr[4] = n;

        //2-6. 세번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][랜던숫자 다섯][랜덤숫자 여섯]
        n = rand.nextInt(45) + 1;
        arr[5] = n;
    }
}