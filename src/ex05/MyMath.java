package ex05;

 class MyMath {
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;

        }return result;
    }
       static void main () {
            System.out.println("10의 3승은 " + MyMath.power(10, 3));
        }
    }
