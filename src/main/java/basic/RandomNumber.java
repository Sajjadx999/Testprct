package basic;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter max number: ");
            int max = input.nextInt();
            System.out.println("Enter min number: ");
            int min = input.nextInt();
            System.out.println("The Random number is: " + (int) Math.random() * (max - min) + min);
        } catch (Exception e){
            System.out.println("You have entered double number, please give integer number");
        } finally {
            System.out.println("You are excited from the program");
        }

    }
}
