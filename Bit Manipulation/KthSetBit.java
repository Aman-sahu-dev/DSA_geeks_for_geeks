public class KthSetBit {
    static void naiveIsKthSet1(int n , int k){
        int x = 1;
        for(int i=0;i<(k-1);i++)
            x = x*2;
        if((n & x) != 0) System.out.println("Yes");
        else System.out.println("No");
    }
    static void naiveIsKthSet2(int n , int k){
        for(int i=0;i<(k-1);i++)
            n=n/2;
        if((n & 1) != 0) System.out.println("Yes");
        else System.out.println("No");
    }
    static void efficientIskthSet1(int n, int k){
        int x = 1<<(k-1);
        if((n&x)!=0) System.out.println("Yes");
        else System.out.println("No");
    }
    static void efficientIskthSet2(int n, int k){
        int x = n>>(k-1);
        if((x&1)!=0) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void main(String[] args) {
        naiveIsKthSet1(2, 3);
        naiveIsKthSet2(5, 3);
        efficientIskthSet1(5, 2);
        efficientIskthSet2(5, 3);
    }
}
