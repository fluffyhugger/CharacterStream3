import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class LAB4 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
            double weight =input.nextDouble();
            System.out.println(weight);
            double height = input.nextDouble();
            System.out.println(height);
        }catch (IOException ex){
            Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
