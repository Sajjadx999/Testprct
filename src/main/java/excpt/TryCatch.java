package excpt;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        try {

            Scanner input = new Scanner (System.in);
            int number = input.nextInt();
            System.out.println("User's input number: " +number);


        }catch (Exception e) {

            System.out.println("Please enter integer number");

        } finally{
            System.out.println("You have exited from the program");
        }
        }



    }

