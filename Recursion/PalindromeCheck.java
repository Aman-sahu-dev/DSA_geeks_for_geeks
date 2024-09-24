package Recursion;

public class PalindromeCheck {
    static boolean isPalindrome(String str, int s , int e){
        if(s>=e) return true;
        return (str.charAt(s)==str.charAt(e)) && isPalindrome(str, s+1, e-1);
    }
    public static void main(String[] args) {
        String str = "ababba";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
