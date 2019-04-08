package Qn2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class AscendingAndDescending {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numArray = new int[3];

        for(int i=0; i<3; i++) {
            System.out.println("Enter a number: ");
            numArray[i] = input.nextInt();
        }
        System.out.println("\nAscending:");

        Arrays.sort(numArray);

        for(int i : numArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nDescending:");

        for(int i= numArray.length-1; i>=0; i--){
            System.out.print(numArray[i] + " ");
        }
    }
}
