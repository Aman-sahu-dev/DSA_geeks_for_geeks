public class IterativePower {
    public static int iterativePower(int x, int n) {
        int res = 1;
        while(n>0){
            if(n%2!=0){
                res = res * x;
            }
            n=n/2;
            x = x*x;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(iterativePower(2, 5));
    }
}
