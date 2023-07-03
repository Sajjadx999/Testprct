package basic;

public class ReverseNumber {
    public static void main(String[] args) {

        int number =543, reverse = 0;
        while (number!=0) {

            int value = number % 10;
            number = number / 10;
            reverse = reverse * 10 + value;

        }

        System.out.println(reverse);


        }
    }

