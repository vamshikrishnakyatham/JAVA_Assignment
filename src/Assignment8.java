import java.util.InputMismatchException;

public class Assignment8 {
    public static void main(String[] args){
        try {
            int[] arr = new int[5];
            arr[0]='q';
            arr[1]=4;
            arr[2]=0;
            arr[3]=9;
            arr[4]=1;
            arr[5]=6;
            System.out.println(arr[1]/arr[4]);
        }
        catch (InputMismatchException | ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Program executed");
        }
    }
}