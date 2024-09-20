public class SparseNumberCheck {
    public static boolean isSparse(int n){
        return (n&(n>>1))==0?true:false;
    }
    public static void main(String[] args) {
        System.out.println("SparseNumberCheck: "+ isSparse(24));
    }
}
