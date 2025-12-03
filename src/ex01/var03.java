package ex01;

public class var03 {
    public static void main(String[] args) {
        int[] arr = {2,4,8,10};
        // []만큼 공간을 확보하라는 의미이며, []만큼의 갯수는 {}에 들어있는 갯수로 파악된다.
        System.out.println(arr[0]);
        //(arr[])에서 []에 들어가는것은 인젝스 주소이며, 빠르게 찾아가기 위해 주소를 입력하는것이 낫다.
        // [0]의경우 2가 들어가는 바이트의 맨 앞으로 이동이 가능하며, [1]의 경우 4의 바이트 맨 앞으로 이동이 가능하다.
    }
}
