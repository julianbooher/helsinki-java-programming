
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String returnString = "";
        for(int i = 0; i < number; i++){
            returnString += "*";
        }
        System.out.println(returnString);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String returnString = "";
        for(int i = 0; i < number; i++){
            returnString += " ";
        }
        System.out.print(returnString);    
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 0; i < height; i++){
            printSpaces(height - 1 - i);
            printStars(i*2 + 1);
        }
        int i = 0;
        while(i < 2){
            printSpaces(height - 2);
            printStars(3);
            i++;
        }


    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
