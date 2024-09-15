public class PowerOfTwo {
   static boolean isPowerOfTwo(int n){
    if(n==0) return false;
    while(n!=1){
        if(n%2!=0)
            return false;
        n=n/2;
    }
    return true;
   }
   static boolean isPowerOfTwoBrainkerningum(int n){
    if(n==0) return false;
    return (n&(n-1))==0?true:false;

   }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwoBrainkerningum(8));

    }
}
