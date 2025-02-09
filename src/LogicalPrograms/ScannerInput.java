package LogicalPrograms;


import java.util.Scanner;

public class ScannerInput {
    
    public void m1(String str) {
        System.out.println("You entered: " + str);
    }

    public static void main(String[] args) {
        ScannerInput t = new ScannerInput();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        //System.out.flush(); // Ensures prompt is displayed immediately
        String s = sc.nextLine();
        t.m1(s);
        sc.close();
    }
}
