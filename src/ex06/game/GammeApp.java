package ex06.game;

public class GammeApp {

    // u1 -> u2를 공격
    static void start(Protoss u1, Protoss u2){
        //u2.hp = u2.hp - u1.attack;
        int reminHp = u2.getHp() - u1.getAttack();
        u2.setHp(reminHp);
    }



    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot();
        Dragoon d1 = new Dragoon();

        start(z1, d1);

        //1. 드라곤 의 상태 확인
        System.out.println(d1.getHp());

        start(d1, z1);

        //2. 질럿 의 상태 확인
        System.out.println(z1.getHp());

        start(z1,z2);

        //3. 질럿2의 상태
        System.out.println(z2.getHp());

        //오버로딩의 한계를 극복하기 위해 오버라이딩을 배워야함.
        System.out.println();
        System.out.println(1);
        System.out.println("kill");
        System.out.println(1.2);
        System.out.println(true);

    }
}
