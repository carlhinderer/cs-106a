import acm.program.*;

public class Palindrome extends ConsoleProgram {
    private static String testCase = "abba";
    
    public void run() {
        println("True of false? " + testCase + " is a palindrome.");
        println(isPalindrome(testCase));
    }
    
    private boolean isPalindrome(String s) {
        println(s);
        if (s.length() == 0 || s.length() == 1) {
            return true;
        } else if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        } else {
            return s.charAt(0) == s.charAt(s.length()-1) &&
                    isPalindrome(s.substring(1, s.length()-1));
        }
    }
}
