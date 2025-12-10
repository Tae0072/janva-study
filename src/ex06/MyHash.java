package ex06;

class Data extends Object{//extends Object를 적지 않아도 적혀 있는 효과. 모든 class는 오브젝트를 상속
    int num;

    public Data(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();//super=자기 부모의 주소를 말함=오브젝트
    }
}

public class MyHash extends Object{
    public static void main(String[] args) {
        Data d1 = new Data(1);
        Data d2 = new Data(1);//상태는 같은데 주소는 다르다.
        Data d3 = d1;//얕은 목사(주소만 복사)

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());//주소가 다른 값

        if(d1.hashCode() == d2.hashCode()){
            System.out.println("같은 주소에 있는 객체");
        }else {
            System.out.println("다른 주소에 있는 객체");
        }
        if(d1.num == d2.num) {
            System.out.println("값이 같습니다.");
        }else {
            System.out.println("값이 다릅니다.");
        }
        if (d1.hashCode()==d3.hashCode()){
            System.out.println("같아요!! 얕은 복사 됐어요.");
        }else {
            System.out.println("달라요! new가 된 다른 주소 같아요");//연산은 주소를 비교하는게 값을 비교하는 것보다 빠르다
        }
    }
}
