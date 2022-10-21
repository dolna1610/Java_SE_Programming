// 7. Find out how many images are in the given array:
//Input: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
//Output: 3
package string_manipulation;
import java.util.*;
public class countingImageArray {

        public static void distinct(String[] S, int M)
        {
            int count = 0;

            // Loop to iterate over all
            // the strings of the array
            for(int i = 0; i < S.length; i++)
            {

                // Distinct characters in the
                // String with the help of set
                Set<Character> set = new HashSet<>();
                for(int j = 0; j < S[i].length(); j++)
                {
                    if (!set.contains(S[i].charAt(j)))
                        set.add(S[i].charAt(j));
                }
                int c = set.size();

                // Checking if its less
                // than or equal to M
                if (c <= M)
                    count += 1;
            }
            System.out.println(count);
        }

        // Driver Code
        public static void main(String[] args)
        {
            String S[] = { "photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg" };
            int M = 7;

            distinct(S, M);
        }
    }
