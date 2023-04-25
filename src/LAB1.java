import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class LAB1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello world!");
            output.write("Welcome to Java!");
            output.close();
        } catch (Exception e) {
            Logger.getLogger(LAB1.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
        try {
            FileReader input = new FileReader("data.txt");
            int ch;
            while ((ch = input.read()) != -1 ){
                System.out.print((char)ch);
            }
        }
        catch (Exception e){
            Logger.getLogger(LAB1.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }
}
