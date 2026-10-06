import java.util.Scanner;
public class conversion{
        public static void main(String[] args) {
        System.out.println("Farenheit to Celsius converter");
        
        Scanner f = new Scanner(System.in);
            System.out.println("Enter degrees in Farenheit:");

            float c ;
            float input;
            input = f.nextFloat();
            c = (input-32)* 5/9;
            System.out.println("Degrees in celsius is" + c);  // Output user input

        }
}
