public class TrailingZerosInFactorial {
    public static int countTrailingZeros(int n) {
        int fact = 1;
        for (int i = 2; i <=n; i++){
            fact *= i;
        }
        int res = 0;
        while(fact%10==0){
            res++;
            fact /= 10;
        }
        return res;
    }
    public static int efficientSolution(int n){
        int res = 0;
        for(int i=5;i<=n;i*=5){
            res = res + (n/i);
        }
        return res;
    }
    public static void main(String[] args) {
        // System.out.println("Count of trailing zeros is: " + countTrailingZeros(10));
        System.out.println("Count of trailing zeros is: " + efficientSolution(251));
    }
}
