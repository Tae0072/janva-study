package ex04;
//OOP : Object Oriented Programing
//1원칙 : 상태는 행위를 통해 변경한다.
public class PeopleApp {
    public static void main(String[] args) {
        People people1 = new People("홍길동", 38, 5);//생성시에 초기화값을 설정
        People people2 = new People("장보고", 20, 3);



        people1.밥먹기();//메서드 (상태변경은 처음 부터가 아닌 생성 후 시간이 지나면서 변경되는것)
        people1.밥먹기();
        System.out.println(people1.getWeight());
    }
}
