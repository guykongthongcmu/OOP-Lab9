// 672115045 Virawit Kongthong OOP Lab 9 Question 2

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        try {
            int[] arr = new int[100];
    
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(1000000);
            }

            System.out.println("Enter a number from 0 - 99");
            int userInput = input.nextInt();
            System.out.println("The value at index " + arr[userInput]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer");
        }
    }
}
