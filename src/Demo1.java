import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int flag = 1;
        //Method 1 Regex O(n) but may be Exponential in complex cases
//        if((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$"))) {
//            flag = 1;
//        }
//        else {
//            flag = 0;
//        }
        //Method 2 O(26) = O(1)
        for(char c='a';c<='z';c++){
            if(!str.contains(String.valueOf(c))){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("String contains all alphabets");
        }
        else{
            System.out.println("String doesn't contain all alphabets");
        }
    }
}