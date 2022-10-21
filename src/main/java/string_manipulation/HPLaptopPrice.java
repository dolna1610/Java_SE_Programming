//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

package string_manipulation;

import java.util.Scanner;

public class HPLaptopPrice {
        public static void main(String args[]) {
            final double d = 0.1;
            Scanner input = new Scanner(System.in);

            int cashPayment;
            double purchasePrice;
            double discounted_price;
            System.out.print("Enter value of cash payment price: ");

            cashPayment = input.nextInt();
            discounted_price = cashPayment * d; // Here discount calculation takes place
            purchasePrice = cashPayment - discounted_price;
            // Displays discounted price
            System.out.println("Value of discounted price: " + discounted_price);
            System.out.println("Value of purchase price: " + purchasePrice);
        }

    }