package main.java;

/**
 * Created by neeraj.bhatnagar on 1/18/2017.
 */
public class checkPalindrome {
    public static void main(String[] args) {
        /*String var = "ABB";
        StringBuffer rev = new StringBuffer(var).reverse();
        String strRev = rev.toString();
        if(var.equalsIgnoreCase(strRev)){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }*/

        //Store varibael in string.
        String var = "ABB";
        // Create mutable(Changeable) string.
        StringBuffer sb = new StringBuffer(var);
        // Reverse Sting buffer
        StringBuffer rev = sb.reverse();
        //Convert to string.
        String strRev = rev.toString();
        if(var.equalsIgnoreCase(strRev)){
            System.out.println("Palindrome");

        }else{
            System.out.println("No Palindrome");
        }


    }
}
