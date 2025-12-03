package ex04;
//메서드
public class Tv01 {
    //코드를 읽을때는 오른쪽에서 왼쪽으로 읽느다.
     boolean status = false; //상태

    void on(){
        System.out.println("tv가 켜졌어요.");
        status = true; //상태 변경
    }

    void off(){
        System.out.println("tv가 꺼졌어요.");
        status = false;
    }

    public static void main(String[] args) {
        //여기 까지는 static 과 main만 입력됨.
        Tv01 tv = new Tv01(); //객체(오브젝트Object) 생성 //new 클래스명();은 static이 아닌것을 Heap(힙)에 다 불러온다.
        System.out.println(tv.status);

        tv.on();//함수의 호출문 - void on을 호출 실행.
        System.out.println(tv.status);

        tv.off();
        System.out.println(tv.status);
    }
}
