package ex06.ch01;

//추상적 클래스(직접적인 객체는 생성하지 않고 분류 기준으로만 동작하는 클래스)
class 재판관 {
}

class 진행자 {
}

class 죄인 {
}

//구체적 클래스
class 왕 extends 재판관 {

}

class 왕비 extends 재판관 {

}

class 토끼 extends 진행자 {

}

class 모자장수 extends 죄인 {

}


public class Ex01 {
    public static void main(String[] args) {
        모자장수 u1 = new 모자장수();//[죄인, 모자장수] - new로 모자장수 heap을 띄우고, 죄인의 heap도 같이 뜬다. - u1은 모자장수를 가르킨다.
        //토끼 u2 = new 진행자();//[진행자] //new한것들 위로 직접적으로 연결된 클래스를 가져올게 없다. //토끼를 new하면, 재판관까지 가져올 수 있다.
        재판관 u3 = new 왕();//[왕, 재판관] - new로 재판관 heap을 띄우고, 왕의 heap도 같이 뜬다. - u3은 재판관를 가르킨다.
        // + 왕비도 재판관으로 해석된다. 왕=/=왕비 타입으로 묶을 수 있다.
    }
}
