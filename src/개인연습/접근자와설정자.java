package 개인연습;

public class 접근자와설정자 {
    private int regNumber;
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void steBalance(int balance) {
        this.balance = balance;
    }


    static void main() {
        접근자와설정자 obj = new 접근자와설정자();
        obj.setName("Tom");
        obj.steBalance(100000);
        System.out.println("이름은 "+obj.getName()+"통장 잔고는 "+obj.getBalance()+"입니다.");
    }
}