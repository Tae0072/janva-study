package ex07;

class Circled{
    int radius;
    public Circled(int radius) {
        this.radius = radius;
    }
    public boolean equals(Circled c1){//equals 는
        if(radius==c1.radius)return true;
        else return false;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circled obj1 = new Circled(10);
        Circled obj2 = new Circled(10);
        if(obj1.equals(obj2)) System.out.println("2개의 원은 같습니다.");
        else System.out.println("2개의 원은 같지 않습니다.");
    }
}
