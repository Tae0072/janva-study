package ex04;

public class Box2 {
    int width, height, depth;
    public void Box(int w, int h, int d) { width=w; height=h; depth=d; }

    public static void main(String[] args) {
        Box2 b = new Box2();
        System.out.println("상자의 크기: ("+b.width+","+b.height+","+b.depth+")");
    }
}
