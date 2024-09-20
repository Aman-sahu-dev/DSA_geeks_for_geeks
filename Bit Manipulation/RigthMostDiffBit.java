public class RigthMostDiffBit {
    public static int posOfRightMostDiffBit(int m, int n)
    {
        int count = 0;
        if(m==n) return -1;
        while(m>=0 && n>=0){
            count++;
            if(((m&1)!=0 && (n&1)!=0) || ((m&1)==0 && (n&1)==0)){
                m = m>>1;
                n = n>>1;
                continue;
            }
            return count;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(17,13));
    }
}
