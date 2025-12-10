package ex05;

class Rect {
    int width, height;

    public Rect(int w, int h) {
        this.height=h;
        this.width = w;
    }
    double getArea() { return (double) width*height;}
}

public class RectArrayTest {
    public static void main(String[] args) {
        Rect[] list;
        list = new Rect[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = new Rect(i, i);

            for (int j = 0; j < list.length; j++) {
                System.out.println(i+"번째 사각형의 면적="+list[i].getArea());
            }
        }
    }
}
