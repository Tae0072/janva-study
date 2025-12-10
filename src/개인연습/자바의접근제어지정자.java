package 개인연습;

class 자바의접근제어지정자 {
    private int a;
    int b;
    public int c;
}

class test{
    static void main() {

        자바의접근제어지정자 obj = new 자바의접근제어지정자();

        //obj.a = 10;
        obj.b = 20;
        obj.c = 30;
    }
}
