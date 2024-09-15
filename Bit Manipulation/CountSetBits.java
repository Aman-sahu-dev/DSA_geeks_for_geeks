public class CountSetBits {
    static int countSetBits(int n){
        int count = 0;
        while(n!=0){
            if((n&1)!=0){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    static int brainKerningumsMethod(int n){
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;           
        }
        return count;
    }
    static int lookupMethod(int n){
        int[] tbl = new int[256];
        tbl[0] = 0;
        for(int i=1;i<256;i++){
            tbl[i] = tbl[i & (i-1)] +1;
        }
        return tbl[n & 255] + tbl[(n>>8) & 255] + tbl[(n>>16) & 255] + tbl[(n>>24)];
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(5));
        System.out.println(brainKerningumsMethod(5));
        System.out.println(lookupMethod(13));
    }
}
