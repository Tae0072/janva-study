package 개인연습;

class 생성자만들어보기 {

    private int channel;
    private int volume;
    private boolean onOff;

    생성자만들어보기(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고, 볼륨은 " + volume + "입니다.");
    }
}
    class 생성자만들어보기01 {
        static void main() {
        생성자만들어보기 sc = new 생성자만들어보기(7,10,true);
        sc.print();

            생성자만들어보기 scc = new 생성자만들어보기(11,20,true);
            scc.print();

        }
    }
