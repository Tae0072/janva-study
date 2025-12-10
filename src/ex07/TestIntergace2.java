package ex07;

class Shapee{
    protected int x, y;
}
interface Drawable{
    void draw();
}
class Circlee extends Shapee implements Drawable{
    int radius;
    public void draw(){
        System.out.println("Cirvle Draw at("+x+", "+y+")");
    }
}

public class TestIntergace2 {
    public static void main(String[] args) {
        Drawable obj = new Circlee();
        obj.draw();
    }
}
