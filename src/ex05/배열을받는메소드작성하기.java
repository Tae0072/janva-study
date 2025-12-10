package ex05;

public class 배열을받는메소드작성하기 {

    public static double min배열을받는메소드작성하기(double[] list) {
        double min = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[1];
        }
        return (min);
    }

    static void main() {
        double[] a = {1.1,2.2,3.3,4.4,0.1,0.2};
        double[]b = {-2.0,3.0,-9.0,2.9,1.5};

        double min;

        min = min배열을받는메소드작성하기(a);
        System.out.println("첫 번째 배열의 최소값="+min);
        min = min배열을받는메소드작성하기(b);
        System.out.println("두 번째 배열의 최소값="+min);
    }

}
