public class BitDiff {
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int count = 0;
        while(a!=b){
            if(((a&1)==0 && (b&1)!=0)|| ((a&1)!=0 && (b&1)==0)){
               count++;
            }
            a = a>>1;
            b = b>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Count: " + countBitsFlip(14, 15));    
    }
}
