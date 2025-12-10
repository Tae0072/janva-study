package ex06.game;
//new로 protooss를 띄우면 하위 클래스인 드라곤,저그,리버 의 데어터값을 오버로딩하여 가져온다. - 동적 결합
public class Protoss {
    public int getHp() {
        return 0;
    }

    public void setHp(int hp) {
        System.out.println("메롱");
    }

    public int getAttack() {
        return -5000;
    }

    public void setAttack(int attack) {

    }
}
