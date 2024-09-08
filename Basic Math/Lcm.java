
public class Lcm {
    public static int lcm(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a == 0 && res%b == 0){
                break;
            }
            res++;
        }
        return res;
    }

    public static int gcd(int a, int b){
        if(b==0)
            return a;
        else return gcd(b, a%b); 
    }
    public static int OptimizedLcm(int a, int b){
        return (a*b)/gcd(a, b);  //Optimized LCM formula
    }
    public static void main(String[] args) {
        System.out.println("Lcm: " + lcm(4, 6));
    }
}
