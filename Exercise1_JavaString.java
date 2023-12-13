/**
 * Exercise1_JavaString
 */
import java.io.*;
import static java.lang.System.out;

public class Exercise1_JavaString {

    public static void main(String[] args) throws IOException {
        String name1,name2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name1 = br.readLine();
        name2 = br.readLine();
        
        out.println("The length of first string is "+name1.length());
        out.println("The length of second string is "+name2.length());
        if(name1.length()==name2.length()) {
            out.println("The length of two strings are the same");
        }else {
            out.println("The length of two strings is not the same");
        }
        if(name1==name2) {
            out.println("Two strings are equal");
        }else {
            out.println("Two strings are not equal");
        }
        
    }

}