package Recursion;

public class PowerOfNumber {
    static final int MOD = 1000000007;    
    static long power(int base,int exp)
    {
       if (exp == 0) {
            return 1;  // Base case: anything to the power of 0 is 1
        }

        long halfPower = power(base, exp / 2);
        halfPower = (halfPower * halfPower) % MOD;

        if (exp % 2 == 1) {
            return (halfPower * base) % MOD;
        } else {
            return halfPower;
        }
    }
    public static void main(String[] args) {
        System.out.println("Power of :"+ power(12,21));
    }
}
