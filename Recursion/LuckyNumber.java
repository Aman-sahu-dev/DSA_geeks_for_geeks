package Recursion;

public class LuckyNumber {
    public static boolean isLucky(int n,int i)
    {
        if(i>n) return true;

        if(n%i==0) return false;

        n = (n - (n/i));
        return isLucky(n, i+1);
    }
    public static void main(String[] args) {
       System.out.println(isLucky(19, 2));
    }
}
