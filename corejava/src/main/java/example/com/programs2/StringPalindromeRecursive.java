package example.com.programs2;

import java.util.Scanner;

public class StringPalindromeRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter string to check if its palindrome or not");

		String str = scan.next();

		char[] chr = str.toCharArray();

		isPal(str);

	}

	// TODO Auto-generated method stub

	 public static boolean isPal(String s)
	    {   // if length is 0 or 1 then String is palindrome
	        if(s.length() == 0 || s.length() == 1)
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))
	        /* check for first and last char of String:
	         * if they are same then do the same thing for a substring
	         * with first and last char removed. and carry on this
	         * until you string completes or condition fails
	         * Function calling itself: Recursion
	         */
	        return isPal(s.substring(1, s.length()-1));

	        /* If program control reaches to this statement it means
	         * the String is not palindrome hence return false.
	         */
	        return false;
	    }

}
