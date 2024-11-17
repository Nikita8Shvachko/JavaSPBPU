import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Hi, please enter your name!\n");
        String name = "";
        try{
            Scanner scan = new Scanner(System.in);
        name = scan.next();
        }
        catch (Exception e){
            System.out.println("Error");
        }

        System.out.print("Hi, " + name + "!\n");

    }
}