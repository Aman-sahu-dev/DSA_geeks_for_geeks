public class MaxConsecutiveOnes {
    public static int maxConsecutiveOnes(int n){
        int maxcount = 0;
        int currcount = 0;
        while(n>0){
            if((n&1)==1){
                currcount++;
                maxcount = Math.max(maxcount,currcount);
            }
            else{
                currcount = 0;
            }
            n = n>>1;
        }
        return maxcount;
    }
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(13));
    }
}
