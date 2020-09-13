package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height;
        do {
            // Displaying a message on the screen
            System.out.print("Height: ");
            height = scanner.nextInt();
        } while( !isValid(height) );

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println(" "); } }

    private static boolean isValid(int height){
        if(height <=1 || height  >= 8){
            return false;
        }  else {
            System.out.println("Stored: " + height);
            return true;
        }

    }

}
