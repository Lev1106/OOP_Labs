package practice1;
import java.util.Scanner;

public class Problem6 {
	public static boolean palindrome(String s) {
		if (s.length() <= 1) return true;
		else if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
		return palindrome(s.substring(1, s.length() - 1));
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        //String s = "racecar";
        String s = input.next();
        if (palindrome(s)) System.out.printf("%s is palindrome", s);
        else System.out.printf("%s is not palindrome", s);
    }
}
