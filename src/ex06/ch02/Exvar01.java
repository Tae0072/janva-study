package ex06.ch02;

class Animal {
    int i = 1;
    String name = "동물";
}

class Cat extends Animal {
    int i = 2;
    //String name = "고양이";
    int age = 5;
}

class Dog extends Animal {
    int i = 3;
    String name = "강아지";
}

public class Exvar01 {
    public static void main(String[] args) {
        Animal a1 = new Animal(); //[Animal]//위에 '주' 가 아래 '주'를 new할수 있지만, 아래'주'가 위에'주'를 new할수 없다.
        System.out.println(a1.i + ", "  +a1.name);

        Dog a2 = new Dog();//[Dog(v), Animal]
        System.out.println(a2.i + ", "  +a2.name);//강아지에서 값이 있으니 동물 까지 가서 값을 가져올 필요가 없다.

        Animal a3 = new Dog();//[Dog, Animal(v)]
        System.out.println(a3.i + ", "  +a3.name);//동물의 자기 값이 있기에 다른데서 가져오지 않는다.

        Cat a4 = new Cat(); //[Cat]
        System.out.println(a4.i + ", "  +a4.name +" 나이 : "+ a4.age);//아래에서 위에 값을 가져올 수 있지만, 위에서 아랫값을 가져올 수 없다.
    }
}
