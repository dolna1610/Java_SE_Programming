//6. Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim live in Rangpur
//Output: Ratul and Fahim lives in Rangpur

package string_manipulation;

public class ReplacingChar {
    public static void main(String[] args)
    {
        String str = "Ratul and Rahim live in Rangpur";

        // Replace all the 'R' characters with 'F' characters.
        String new_str = str.replace('R', 'F');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
