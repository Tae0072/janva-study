package ex08.Ch01;

/**
 * checked exception
 * unchecked exception
 */

public class CheckTry {

    static void m1() throws Exception {
        throw new Exception("강제로 던진 Checked Exception");
    }

    static void m2(){
        throw new RuntimeException("강제로 던진 Checked Exception");
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        m2();
    }
}
