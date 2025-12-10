package comp;

/**
 * 1. is 상속
 * 2. can do 인터페이스
 * 3. has 결합(Composite) - 상태로 가지면 됨.- 잘 만들어진것을 가지고 와서 사용.
 */
public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
        System.out.println("버거세트가 만들어 졌어요.");
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

    public int getTotalPrice(){
        int totalPrice = burger.getPrice()+coke.getPrice()+potato.getPrice();// set메뉴의 값을 모두 합한것.
        totalPrice = (int) (totalPrice*0.9);//10%할인
        return totalPrice;
    }
}
