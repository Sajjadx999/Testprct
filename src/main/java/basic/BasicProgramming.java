package basic;

import java.util.Scanner;

public class BasicProgramming {
    static String name = "Jon";

    public static void main(String[] args) {

        System.out.println("Hello Java!");
        String MyString = "Hello Java";
        System.out.println(MyString);

        //String name = "Jon";

        name = "Alex";

        System.out.println(name);

        double number = 214748364733.00;
        double number1 = 21478.40;

        int number2 = (int) number;
        int number3 = (int) number1;
        System.out.println(number2);
        System.out.println(number3);

        double number4 = 4355.67;
        System.out.println(Math.round(number4));
        System.out.println(Math.ceil(number4));
        System.out.println(Math.floor(number4));

        int number5 = 2400;
        int number6 = 1400;
        System.out.println(Math.max(number5, number6));
        System.out.println(Math.min(number5, number6));
        System.out.println(Math.sqrt(number5));
        //Math.power, pending
        //Math.abs, pending
        //Math.random, pending

        Scanner input = new Scanner(System.in);

        int number7 = input.nextInt();
        double number8 = input.nextDouble();
        float number9 = input.nextFloat();
        //String number10 = input.nextLine();
        System.out.println("User's input number: " +number7);
        System.out.println("User's input number: " +number8);
        System.out.println("User's input number: " +number9);
        //System.out.println("User's input number: " +number10);


    }
}
