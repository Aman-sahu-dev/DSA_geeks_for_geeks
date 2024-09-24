package Recursion;

public class PrintFactorial {
    static int printFactorial(int n){
        if(n<=1) return n;
        return n*printFactorial(n-1);
    }

    static int factorialUsingTailRecursion(int n,int a){
        if(n<=1) return a;
        return factorialUsingTailRecursion(n-1, a*n);
    }
    public static void main(String[] args) {
        System.out.println("Factorial: " + printFactorial(5));
        System.out.println("Factorial: " + factorialUsingTailRecursion(5,1));
    }
}
