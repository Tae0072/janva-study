package ex06;

public class MyLIst {
    String key;
    String value;
    MyLIst next;

    public MyLIst(String key, String value, MyLIst next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setNext(MyLIst next) {
        this.next = next;
    }
}

class MyList01 {
    public static void main(String[] args) {
        // 1. 첫번째 노드
        MyLIst n1 = new MyLIst("name", "홍길동", null);

        // 2. 두번째 노드
        MyLIst n2 = new MyLIst("age", "11", null);
        n1.setNext(n2);

        // 3. 세번째 노드
        MyLIst n3 = new MyLIst("weight", "50", null);
        n2.setNext(n3);

        System.out.println(n1.value);
        System.out.println(n1.next.value);
        System.out.println(n1.next.next.value);

        //4. n2 삭제하기
        n1.setNext(n3);
        System.out.println(n1.value);
        System.out.println(n1.next.value);
        System.out.println(n1.next.next.value);
    }
}
