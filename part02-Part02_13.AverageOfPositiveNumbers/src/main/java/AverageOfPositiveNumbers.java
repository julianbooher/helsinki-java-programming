
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            } else if (num > 0) {
                sum += num;
                count += 1;
            }
        }
        
        if (sum == 0){
            System.out.println("Cannot calculate the average.");
            
        } else {
            System.out.println("Average of the numbers: " + ((double) sum / count));
            
        }

    }
}
