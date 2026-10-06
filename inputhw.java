import java.util.Scanner;
public class inputhw {
        public static void main(String[] args)
         {
            Scanner scanner = new Scanner(System.in); 
            System.out.print("What's your name?");
            String name = scanner.next();
            System.out.print("What's your surname?");
            String surname = scanner.next();
            System.out.print("Enter your year of birth: ");
            int year = scanner.nextInt();

            int age = 2026 - year;

            System.out.println("Hello " + name + " !");
            System.out.println("You are about to become " + (age+1) + " years old!");

    
}
}
