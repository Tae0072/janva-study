package algo;

import java.util.Random;

public class Lotto06 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2-1. 첫번째 추첨 [랜던숫자 하나][][][][][] - 픽스 -9
            while (true) {
                boolean isSame = false; //= isSame 같니?
                n = rand.nextInt(45) + 1; //- 15

                int i = 0;

                for (int j = 0; j < 0; j++) {
                    if (arr[i] == n) {
                        isSame =true;
                    }
                }i++;
                if (isSame) {
                    arr[0] = n;
                    break;
                }
            }

        //2-2. 두번째 추첨 [랜던숫자 하나][랜던숫자 둘][][][][] - 중복 x
        while (true) {
            boolean isSame = false; //= isSame 같니?
            n = rand.nextInt(45) + 1; //- 15
            int i=0;
            if (arr[i] == n) {
                isSame = true;
            }
            i++;
            if (isSame) {
                arr[1] = n;
                break;
            }
        }

        //2-3. 세번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][][][]
        while (true) {
            boolean isSame = false; //= isSame 같니?
            n = rand.nextInt(45) + 1; //- 20
            int i=0;
            if (arr[i] == n) {
                isSame = true;
            }
            i++;
            if (arr[i] == n) {
                isSame = true;
            }
            i++;
            if (isSame) {
                arr[2] = n;
                break;
            }
        }
        //2-4. 네번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][][]
        while (true) {
            boolean isSame = false; //= isSame 같니?
            n = rand.nextInt(45) + 1; //- 45
            int i=0;
            if (arr[i] == n) {
                isSame = true;
            }
            i++;
            if (arr[i] == n) {
                isSame = true;
            }
            i++;
            if (arr[i] == n) {
                isSame = true;
            }
            i++;
            if (isSame) {
                arr[i] = n;
                break;
            }
        }
        //2-5. 다섯번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][랜던숫자 다섯][]
        while (true) {
            boolean isSame = false; //= isSame 같니?
            n = rand.nextInt(45) + 1; //- 42
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n) {
                isSame = true;
            }
            if (arr[2] == n) {
                isSame = true;
            }
            if (arr[3] == n) {
                isSame = true;
            }
            if (isSame) {
                arr[4] = n;
                break;
            }
        }

        //2-6. 여섯번째 추첨 [랜던숫자 하나][랜던숫자 둘][랜던숫자 셋][랜던숫자 넷][랜던숫자 다섯][랜덤숫자 여섯]
        while (true) {
            boolean isSame = false; //= isSame 같니?
            n = rand.nextInt(45) + 1; //- 41
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n) {
                isSame = true;
            }
            if (arr[2] == n) {
                isSame = true;
            }
            if (arr[3] == n) {
                isSame = true;
            }
            if (arr[4] == n) {
                isSame = true;
            }
            if (isSame) {
                arr[5] = n;
                break;
            }
        }
    }
}