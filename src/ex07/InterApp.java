package ex07;

interface 리모컨이할수있는것{//행동을 제약하는것. can do
    public abstract void power();
}

abstract class 리모컨 implements 리모컨이할수있는것{//implements한것은 반듯이 수행해야함.단 추상클래스는 미룰 수 있음.
    private boolean power;

    public 리모컨() {
        this.power = false;
    }

    public void power(){
        this.power = !this.power;//행위가 제약되어서 power만 사용 가능.
    }

    public boolean isPower() {
        return power;
    }
}

class 엘지리모컨 extends 리모컨 {
    public 엘지리모컨() {
        //super(); //부모를 지칭하면 super.  따로 적지 않아도 적혀있는 효과를 낸다.(생략되어 있다)
    }
}

class 삼성리모컨 extends 리모컨 {
    public 삼성리모컨() {

    }
}

//인터페이스(상하관계의 약속)
public class InterApp {
    public static void main(String[] args) {
        리모컨 r1 = new 삼성리모컨();
        r1.power();//켜다
        System.out.println(r1.isPower());
        r1.power();//끄다
        System.out.println(r1.isPower());
    }
}
