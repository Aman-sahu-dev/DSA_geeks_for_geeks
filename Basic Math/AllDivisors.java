public class AllDivisors {
    public static void allDivisors(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0) System.out.print(i+ " ");
        }
    }
    public static void optimizedAllDivisors(int n){
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                System.out.print(i+ " ");
                if(i!=(n/i))
                    System.out.print(n/i+" ");
            } 
        }
    }
    public static void main(String[] args) {
        // allDivisors(100);
        System.out.println();
        optimizedAllDivisors(176);
    }
}
