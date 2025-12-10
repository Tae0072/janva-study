package 개인연습;

public class 극장안의관객수세기 {
    public static void main(String[] args) {

        int[][] seats = { {0,0,0,1,1,0,0,0,0},
                                    {0,0,1,1,0,0,0,0,0},
                                    {0,0,0,0,0,1,1,1,0}};
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[j].length; j++) {
                count += seats[i][j];

                System.out.println("현재 관객 수는 "+count+"명입니다.");
            }
        }
    }
}
