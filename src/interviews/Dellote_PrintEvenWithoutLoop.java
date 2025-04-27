package interviews;

public class Dellote_PrintEvenWithoutLoop {
    public static void printEven(int num) {
        if (num > 20) {  // Base condition to stop recursion
            return;
        }
        System.out.print(num + " ");
        printEven(num + 2);  // Recursive call with increment of 2
    }

    public static void main(String[] args) {
        printEven(2); // Start from 2
    }
}
