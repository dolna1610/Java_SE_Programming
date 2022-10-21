//4. Write a program that will give following output:
//Input: Chattogram
//Output: C8M

package string_manipulation;

public class CountingCharAndNumber {
// Java program to find first,last character
// and number of given string
public static void main(String args[])
{
    // Given string str
    String str = "Chattogram";


}
        public static void
        firstAndLastCharacter(String str)
        {

            // Finding string length
            int n = str.length();

            // First character of a string
            char first = str.charAt(0);

            // Last character of a string
            char last = str.charAt(n - 1);
            int count = 0;
            System.out.println("String: "+str);
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i)))
                    count++;
            }
            System.out.println("Letters: "+count);
            // Printing first and last
            // character of a string
            System.out.println("First: " + first);
            System.out.println("Last: " + last);
        }


    }
