package algo;

import java.util.Random;//자바 유틸 폴더안에 기본적으로 들어있는 클래스

public class Lotto01 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2-1. 첫번째 추첨 [랜던숫자 하나][][][][][]
        n = rand.nextInt(45)+1;
        arr[0] = n;

        //2-2. 두번째 추첨 [랜던숫자 하나][랜던숫자 둘][][][][]
        n = rand.nextInt(45)+1;
        arr[1] = n;

        //2-3. 세번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][][][]
        n = rand.nextInt(45)+1;
        arr[2] = n;

        //2-4. 첫번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][][]
        n = rand.nextInt(45)+1;
        arr[3] = n;

        //2-5. 두번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][랜던숫자 다섯][]
        n = rand.nextInt(45)+1;
        arr[4] = n;

        //2-6. 세번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][랜던숫자 다섯][랜덤숫자 여섯]
        n = rand.nextInt(45)+1;
        arr[5] = n;

    }
}
