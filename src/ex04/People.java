package ex04;

public class People {
//상태에는 private를 붙인다 - 상태에 직접적으로 접근하지 못하고 메서드로만 변경 가능하다.
    private String name;//이름
    private int heigh;//키
    private int weight;//무게

    People(String name, int heigh, int weight) {
        this.name = name;
        this.heigh = heigh;
        this.weight = weight;
    }
//public 어느 공간에서도 열 수 있도록 만든다.(모든 파일에서 접근 가능)
    //상태변경
    public void 밥먹기(){
        weight = weight+2;
    }
    //상태확인
    public int getWeight(){
        return weight;
    }

}
