package 과제;

public class Exam05 {
    public static void main(String[] args) {
        // 3행!! space2, star 1  /    ***
        // 4행!! space3, star 1  /   ****
        // 5행!! space4, star 1  /  *****

        String space = " ";
        String star = "*";
        int row = 10;
        int n1 = row-1;
        int n2 = 1;

        for (int k = 0; k < row; k++) {
            for (int i = 0; i < n1; i++) {
                System.out.print(space);
            }
            for (int p = 0; p < n2; p++) {
                System.out.print(star);
            }
            System.out.println();
            n1--;
            n2++;
        }
    }
}