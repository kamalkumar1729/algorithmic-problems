package recursion;


// TODO complete this; its wrong.

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("kamak"));
    }

    private static boolean isPalindrome(String str) {
        if (str.length() == 1) return true;
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length() - 2));
        else
            return false;
    }
}
