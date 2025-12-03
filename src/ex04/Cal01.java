package ex04;

public class Cal01 {
    // add(+), main(-), multi(*), divide(/)
    // 함수
    //static이 붇지 않으면 main에 불러 갈수 없음.
    static void add(int a, int b) {
        System.out.println("a+b="+(a+b));
    }
    static void main(int c, int d) {
        System.out.println("c-d="+(c-d));
    }
    static void multi(int e, int f) {
        System.out.println("e*f="+(e*f));
    }
    static void divide(int j,int k) {
        System.out.println("j/k="+(j/k));
    }

    public static void main(String[] args) {
        add(3, 5);
        // add 앞에 Cal01을 붙여야 하는데 같은 파일 안에서는 생략이 가능.
        main(3,6);
        multi(5,5);
        divide(7,7);
    }
}
