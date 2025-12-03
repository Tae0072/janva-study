package 과제;

public class 별찍기 {
    public static void main(String[] args) {

        //노가다
        System.out.print("*");
        System.out.println();
        System.out.print("**");
        System.out.println();
        //연산+노가다
        int a = 0;

        a++;
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        a++;
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        a++;
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        //연산
        for (int i = 0; i < 5; i++) {
            a++;
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //거꾸로 별
        for (int i = 0; i < 5; i++) {
            a--;
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        String star = "*";
        // 0행
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.println();

        // 1행
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.println();

        // 2행
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.println();

        // 3행
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.println();

        // 4행
        System.out.print(star);//ctrl+d
        System.out.print(star);//ctrl+d
        System.out.println();

        // 5행
        System.out.print(star);//ctrl+d
        System.out.println();
        //1행
        for (int i = 0; i < 6; i++) {
            System.out.print(star);//ctrl+d
        }
        System.out.println();
        //2행
        for (int i = 0; i < 5; i++) {
            System.out.print(star);//ctrl+d
        }
        System.out.println();
        //3행
        for (int i = 0; i < 6; i++) {
            System.out.print(star);//ctrl+d
        }
        System.out.println();
        //
        int c = 3;
        int row = 5;
        for (int i = 0; i < c; i++) {
            System.out.print(star);//ctrl+d
        }
        System.out.println();
        c--;

        for (int i = 0; i < c; i++) {
            System.out.print(star);//ctrl+d
        }
        System.out.println();
        c--;

        //
        for (int k = 0; k < row; k++) {
            for (int i = 0; i < c; i++) {
                System.out.print(star);//ctrl+d
            }
            System.out.println();
            c--;
        }

    }

}
