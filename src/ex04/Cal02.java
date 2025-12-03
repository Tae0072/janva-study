package ex04;

public class Cal02 {
    // add(+), main(-), multi(*), divide(/)
    // 함수
    //static이 붇지 않으면 main에 불러 갈수 없음.
    static int add(int a, int b) {
        return a+b;
    }
    static int main(int c, int d) {
        return c-d;
    }
    static int multi(int e, int f) {
        return e*f;
    }
    static int divide(int j,int k) {
       return k/k;
    }

    public static void main(String[] args) {
        int r1 = add(3, 5);
        // add 앞에 Cal01을 붙여야 하는데 같은 파일 안에서는 생략이 가능.
        int r2 = main(3,6);
        int r3 = multi(5,5);
        int r4 = divide(7,7);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r1+r2+r3+r4);
    }
}
