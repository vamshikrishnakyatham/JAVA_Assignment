package Assignment6;

public class Q2{

    Q2() {
        System.out.println("constructor 1 is running. ");
    }
    Q2(int str) {
        this();
        System.out.println(str);
    }
    public static void main(String[] args) {
        Q2 obj = new Q2(5);
    }
}
