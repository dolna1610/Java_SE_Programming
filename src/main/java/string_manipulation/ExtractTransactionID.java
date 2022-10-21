// 1. Extract the transaction ID from the following HTML body
//Input:
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456
package string_manipulation;
import java.io.*;
import java.util.*;
// Importing java URL class
import java.net.URL;
public class ExtractTransactionID {

        public static void main(String[] args)
                throws FileNotFoundException
        {

            // Try block to check exceptions
            try {
                String val;

                URL URL = new URL(
                        "file:///C:/Users/dolna/IdeaProjects/String-Manipulation");

                // Reading the HTML content from the .HTML File
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(URL.openStream()));

            /* Catching the string and  if found any null
             character break the String */
                while ((val = br.readLine()) != null) {
                    System.out.println(val);
                }

                // Closing the file
                br.close();
            }

            // Catch block to handle exceptions
            catch (Exception ex) {

                // No file found
                System.out.println(ex.getMessage());
            }
        }
    }