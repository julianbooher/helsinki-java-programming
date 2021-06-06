
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int num = Integer.valueOf(scanner.nextLine());        
        System.out.println("Give the second number:");
        int numTwo = Integer.valueOf(scanner.nextLine());
        if (num > numTwo){
            System.out.println("The greater number is: " + num);
        } else if (num < numTwo) {
            System.out.println("The greater number is: " + numTwo);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
