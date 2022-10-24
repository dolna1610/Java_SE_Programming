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
import java.net.URL;

public class ExtractTransactionID {
        public static void main(String[] args)
        {
                String html_body="<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        int pos= html_body.indexOf("TXN");
        String txnid = html_body.substring(pos, pos+9);
        System.out.println(txnid);
}
}
        

            
