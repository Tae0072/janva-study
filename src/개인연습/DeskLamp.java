package 개인연습;

public class DeskLamp {

    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String toString() {
        return "현재 상태는" + (isOn == true ? "켜짐" : "꺼짐");
    }
}
     class DeskLamp클래스작성하고객체생성해보기 {
        public static void main(String[] args) {
            DeskLamp myLemp = new DeskLamp();

            myLemp.turnOn();
            System.out.println(myLemp);
            myLemp.turnOff();
            System.out.println(myLemp);
        }
    }
