package 개인연습;

class 기본생성자 {

    int width, height, depth;
}

class 기본생성자01 {
    static void main() {
        기본생성자 a = new 기본생성자();
        System.out.println("상장의 크기: ("+a.width + ", "+a.height + ", " + a.depth + ")");
    }
}