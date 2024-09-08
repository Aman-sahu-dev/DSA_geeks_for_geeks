public class PrimeNumber {
    public static boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public static boolean OptimizedIsPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i*i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public static boolean moreOptimized(int num){
        if(num == 1) return false;
        if(num == 2 || num ==3 ) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i=i+6){
            if(num%i==0 || num%(i+2)==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 1032;
        System.out.println(num+ " is Prime: "+ isPrime(num));
        System.out.println(num+ " is Prime: "+ OptimizedIsPrime(num));
        System.out.println(num+ " is Prime: "+ moreOptimized(num));
    }
}
