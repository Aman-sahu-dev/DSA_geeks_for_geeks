package Recursion;

public class SumOfFirstNaturalNo {
    static int printSum(int n){
        if(n<1) return n; 
        return n+printSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Sum of first natural numbers: "+ printSum(10));
    }
}
