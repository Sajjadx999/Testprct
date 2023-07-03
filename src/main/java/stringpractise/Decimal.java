package stringpractise;

import java.text.DecimalFormat;

public class Decimal {

    public static void main(String[] args) {

        double a = 15.5273;
        DecimalFormat df= new DecimalFormat("#0.00");
        System.out.println("Value upto 2 decimal points: "+ df.format(a));

    }
}
