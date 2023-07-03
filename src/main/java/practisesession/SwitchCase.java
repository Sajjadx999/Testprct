package practisesession;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Give choice: n1.Tea\n2.Coffee\n3.Water");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("This is your Tea");
                break;
            case 2:
                System.out.println("This is your Coffee");
                break;
            case 3:
                System.out.println("This is your Water");
                break;

            default:
                System.out.println("Thanks for try");

        }


    }
}
