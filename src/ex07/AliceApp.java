package ex07;

abstract class 판사 {
    public abstract void 심문();//-추상 클래스 //abstract는 소 괄호를 사용할 수 없다.
    // 자식 클래스가 공통될 때 부모의 메서드는 하나로 통일 시킬 수 있다.
    //추상 클래스는 new 할 수 없다.
    //자식의 내용이 같으면 자식의 내용을 지우고, 부모의 클래스에 추상적으로 올릴 수 있다.
    //구체적인 행위가 오브젝트마다 다를때!!
    public void 종료() {
        System.out.println("심문을 종료한다.");
    }
}
class 왕 extends 판사{// 판사is 왕
    public void 심문(){//부모 클래스를 구체적으로 재 정의한것.-추상 클래스를 먼저 만든 후 자식의 구체적 클래스를 정한다.
        System.out.println("왕은 심문한다.");
    }
}
class 왕비 extends 판사{
    public void 심문(){
        System.out.println("왕비는 심문한다.");
    }
}

abstract class 증인 {
    public abstract void  대답();
}
class 모자장수 extends 증인 {
    public void 대답(){
        System.out.println("모자 장수는 대답한다.");
    }
}
class 엘리스 extends 증인 {
    public void 대답(){
        System.out.println("엘리스는 대답한다.");
    }
}


public class AliceApp {
    public static void main(String[] args) {
        //1. 인스턴스 초기화
        증인 c1 = new 모자장수();//모자장수, 증인 //추상적인 것에 의존 -
        증인 c2 = new 엘리스();
        판사 c3 = new 왕();
        판사 c4 = new 왕비();

        //2. 실행
        c1.대답();
        c2.대답();
        System.out.println();

        c3.심문();
        c3.종료();
        System.out.println();

        c4.심문();
        c4.종료();
    }
}
