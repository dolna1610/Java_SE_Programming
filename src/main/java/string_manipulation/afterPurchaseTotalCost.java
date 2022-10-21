//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?

package string_manipulation;

import java.util.Scanner;

public class afterPurchaseTotalCost {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            final double SHIRT_COUNT = 1200;

            double shirt = SHIRT_COUNT;

            // Get number of shirts purchased.
            System.out.println("Enter the number of shirts "
                    + "you have purchased to see your discount. ");
            System.out.println("Enter the number of saree "
                    + "you have purchased to see your discount. ");

            int shirts = input.nextInt();
            int saree = input.nextInt();

            int discount = (int)(shirts * saree);
            switch (discount) {

                case 1:
                    discount = (int) .40;
                    break;
                case 2:
                    discount = (int) .30;
                    break;
                case 3:
                    discount = (int) .20;
                    break;
                case 4:
                    discount = (int) .10;

                default:
                    discount = 0;
                    break;
            }
            double finalDiscount = (saree * shirts) * (1.0 - discount);

            System.out.println("Your discount is " + discount);
            System.out.println("Your total is " + finalDiscount);
        }
    }
