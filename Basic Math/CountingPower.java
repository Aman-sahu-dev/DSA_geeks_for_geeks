public class CountingPower {
    public static int countPower(int x,int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        return res;
    }

    public static int efficientCountingPower(int x,int n) {
        if(n==0) return 1;
        int temp = efficientCountingPower(x, n/2);
        temp = temp * temp;
        if(n%2==0)  return temp;
        else return temp * x;
    }
    public static void main(String[] args) {
        System.out.println(countPower(2, 3));
        System.out.println(efficientCountingPower(2,5));
    }
}
