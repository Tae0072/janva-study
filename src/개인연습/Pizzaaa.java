package 개인연습;

class Pizzaa
{
    int size;
    String type;

    public Pizzaa() {
        size = 12;
        type = "슈퍼슈프림";
    }

    public Pizzaa(int s, String t){
        size = s;
        type = t;
    }
}
 class Pizza생성자테스트 {
    public static void main(String[] args) {
        Pizzaa obj1 = new Pizzaa();
        System.out.println("("+obj1.type+ " , "+obj1.size+",)");

        Pizzaa obj2 = new Pizzaa(24, "포테이토");
        System.out.println("("+obj1.type+ " , "+obj1.size+",)");
    }
}