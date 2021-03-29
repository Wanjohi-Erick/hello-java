package MainPackage;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         String name;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Your name is "+ name);
        scanner.close();

        getName(name);
    }

    public static void getName(String name) {
        String newName = name;
        System.out.print(newName);
    }

    
}
