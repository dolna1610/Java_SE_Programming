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

        String firstChar= String.valueof(str.toChararray()[0]).toUpperCase ();
        int length= str.length();
    String lastChar= String.valueof(str.toChararray()[length-1]).toUpperCase ();
    String shortCode= firstChar+(length-2)+ lastChar ;
    System.out.println(shortCode);
}
}
