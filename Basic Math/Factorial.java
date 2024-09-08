public class Factorial {
    public static int factorialUsingLoop(int num){
        int fact = 1;
        for(int i = 2; i <=num; i++){
            fact *= i;
        }
        return fact;
    }

    public static int factorialUsingRecurr(int num){
        if(num == 0 || num == 1)
            return num;
        return num*factorialUsingRecurr(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial Loop: " + factorialUsingLoop(num));
        System.out.println("Factorial Recursion: " + factorialUsingRecurr(num));
    }
}
