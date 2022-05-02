package Assignment6;

class Q3 {

    Q3(String str) {
        System.out.println(str);
    }

};
public class Q4 {

    public static void main(String[] args) {
        Q3[] obj=new Q3[2];
        obj[0]=new Q3("Vamshi");
        obj[1]=new Q3("Vamshi-Krishna");
    }
}