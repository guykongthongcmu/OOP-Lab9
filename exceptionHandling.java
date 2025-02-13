// 672115045 Virawit Kongthong OOP Lab 9 Question 1

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter 2 numbers:");
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println(a + b);

            
        } catch (InputMismatchException e) {
            System.out.println("Please input integers");
        }
    }
}
