public class Palindrome {
    public static boolean isPalindrome(int num){
        int rev = 0;
        int temp = num;
        while(temp>0){
            int lastDigit = temp%10;
            rev = rev * 10 + lastDigit;
            temp/=10;
        }
        System.out.println(rev);
        return rev == num;
    }
    public static void main(String[] args) {
        System.out.println("Palindrome");
        int number = 2342;
        System.out.println(isPalindrome(number));
    }
}
