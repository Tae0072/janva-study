package comp;

public class Burger {
    private String name;
    public int price;



    public Burger(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name+"가 만들어졌어요.");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
