import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("[A-Z].*\\.");
        Matcher m = p.matcher("Alphabets");
        boolean b = m.matches();
        System.out.println(b);
    }
}