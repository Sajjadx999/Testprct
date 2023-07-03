package Test;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give a number: ");
        int sum =0;
        char ch;

        do {
            int number = input.nextInt();
            sum = sum + number;
            System.out.println(sum);
            System.out.println("Do you want to continue?");
            ch= input.next().charAt(0);

        } while (ch!='q');

    }
}
