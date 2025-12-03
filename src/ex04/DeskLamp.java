package ex04;

public class DeskLamp {
    //인스턴트 변수 저의            //켜짐이나 꺼짐과 같은 램프의 상태
    public boolean isOn;

    //메소드 정의
    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    public String toString() {
        return "현재 상태는" + (isOn == true ? "켜짐" : "꺼짐");
    }
}

