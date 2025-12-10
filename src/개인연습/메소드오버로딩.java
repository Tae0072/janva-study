package 개인연습;

class MyMath {

    int add(int x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    int add(int x, int y, int z, int w) {
        return x + y + z + w;
    }

    public class 메소드오버로딩 {
        public static void main(String[] args) {
            MyMath obj;
            obj = new MyMath();
            System.out.println(obj.add(10,20));
            System.out.println(obj.add(10,20,30)+" ");
            System.out.println(obj.add(10,20,30,40)+" ");
        }
    }
}