public class CountDigits {
    public static void countDigits(int num){
        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int number = 123;
        countDigits(number);
    }
}
