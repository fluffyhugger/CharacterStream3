import java.io.*;
import java.util.logging.Logger;

public class characterStream3 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter input = new BufferedWriter(file);
            input.write("Hello world!");
            input.write("Welcome to Java!");
            input.close();
        }catch (IOException e){
            Logger.getLogger(characterStream3.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String s ;
            while ((s = input.readLine()) != null){
                System.out.println(s);
            }

        }catch (Exception e){
            Logger.getLogger(characterStream3.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }
}
