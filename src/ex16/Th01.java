package ex16;

//클래스 이름은 뭐든 상관 없음
//자바는 클래스로 감싸야 메서드가 생성이 가능 - 다른 언어는 클래스로 삼싸지 않아도 메서드 생성 가능.
class Hello implements Runnable {//thread(스레드)는 Runnable을 가져와야 사용이 가능하다.
    // 행위를 강제하기 위해 can do를 사용해야함
    //Runnable 은 run을 강제

    // sub 스레드
    @Override
    public void run() {//메서드의 재 정의. Runnable의 메서드를 불러옴
        for (int i = 0; i < 100; i++) {
            System.out.println("sub 스레드 : " + i);
        }
        System.out.println("sub 스레드 종료");
    }
    // start 한다고 절대 스레드가 실행 안됨.
    // public void good(){
    //
    // }
}

public class Th01 {
    //메인 스레드
    public static void main(String[] args) {
        System.out.println("첫번째실행");
        System.out.println("두번째실행");
        System.out.println("세번째실행");
        Hello hello = new Hello();
        //
        Thread sub = new Thread(hello);
        sub.start(); //새로운 큐의 스레드가 생김 //run 메서드가 새로운 작업단위가 된다.
        //start 를 실행했지만 run 이 샐행됨. - 콜백
        for (int i = 0; i < 100; i++) {
            System.out.println("main 스레드 : " + i);
        }
        System.out.println("main 스레드 종료");
    }
}
//컴퓨터 상황에 따라 다음