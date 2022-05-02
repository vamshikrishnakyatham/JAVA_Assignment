package Assignment5;

public class Assignment5_2 {
    String str;
    public static String method(String str){
        str="abc";
        print(str);//non-static method can't be refferenced from static method
        return str;
    }
    public static void print(String str){
        System.out.println(str);
    }

}
