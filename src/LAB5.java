import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class LAB5 {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        System.out.print("Enter text: ");
        try {
            System.out.print("Enter name:");
            String name = input.readLine();
            System.out.println(name);
        }
        catch (IOException e){
            Logger.getLogger(LAB5.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }
}
