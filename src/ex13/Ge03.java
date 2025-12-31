package ex13;

/**
 * Object로 설계할 수 밖에 없는 이유
 */

//싱글 패턴
class 서랍<T> {

    Object data;

    public static 서랍 instance = new 서랍();// static이라 한번 띄운다.

    private 서랍() { //private 으로 제네릭을 사용하기 힘들다. new하지 않고 Object띄운다. Object로 설계 할 수 밖에 없다.

    }
}

public class Ge03 {
    public static void main(String[] args) {
        서랍 s = 서랍.instance;
        s.data = "안녕";

        //다운케스팅
        String castData = (String) s.data;//Object은 다운케스팅으로 써야한다. // 제네릭은 new할때 지정하여 사용한다.
        int len = castData.length();
        System.out.println(len);
    }
}
