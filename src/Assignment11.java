import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Assignment11 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> charCounter = new HashMap<>();
        FileInputStream file = new FileInputStream("/Users/Vamshi Krishna/sessions");
        DataInputStream dis = new DataInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(dis));
        FileOutputStream fileOut=new FileOutputStream("/Users/Vamshi Krishna/output.txt");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        String temp = "";
        while ((temp=br.readLine()) != null)
        {
            String[] spliter= temp.split("");
            for(String temp1:spliter)
                if(charCounter.containsKey(temp1)){
                    charCounter.put(temp1,charCounter.get(temp1)+1);
                }else{
                    charCounter.put(temp1,1);
                }


        }

        out.writeObject(charCounter);
        out.close();
        fileOut.close();
        System.out.println("file saved.");
        System.out.println(charCounter);

    }
}