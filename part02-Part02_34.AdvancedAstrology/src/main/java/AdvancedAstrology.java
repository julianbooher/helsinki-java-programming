
public class AdvancedAstrology {

    public static String printStars(int number) {
        // part 1 of the exercise
        String returnString = "";
        for(int i = 0; i < number; i++){
            returnString += "*";
        }
        return returnString;
    }

    public static String printSpaces(int number) {
        // part 1 of the exercise
        String returnString = "";
        for(int i = 0; i < number; i++){
            returnString += " ";
        }
        return returnString;    
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
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
