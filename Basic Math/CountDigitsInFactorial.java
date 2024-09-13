import java.math.BigDecimal;

public class CountDigitsInFactorial {
    public static int logDigitsInFactorial(int N) {
        if (N == 0 || N == 1) {
            return 1; // Factorial of 0 and 1 is 1, which has 1 digit
        }

        // Sum of log10 of all numbers from 1 to N
        double digitCount = 0;

        for (int i = 2; i <= N; i++) {
            digitCount += Math.log10(i);
        }

        // The number of digits is the floor of the sum plus 1
        return (int) Math.floor(digitCount) + 1;
    }
    public static BigDecimal factorial(int n){
        BigDecimal fact = new BigDecimal("1");
        for(int i=1;i<=n;i++){
            fact = fact.multiply(BigDecimal.valueOf(i));
        }
        System.out.println(fact);
        return fact;
    }
    public static int digitsInFactorial(int N){
        BigDecimal res = factorial(N);
        return res.toString().length();
    }
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(42));
    }
}
