package Recursion;

public class DigitalRoot {
    public static int digitalRoot(int n)
    {
        if(n<=9) return n;

        int sum = 0;
        while(n!=0) {
            sum +=n%10;
            n /= 10;
        }
        return digitalRoot(sum);
    }
    public static void main(String[] args) {
        System.out.println(digitalRoot(99999));
    }
}
