package Recursion;

public class TOH {
    static int steps = 1;
    public static long toh(int n, int from, int to, int aux) {
        if(n==1){
            System.out.println("move disk "+ n + " from rod "+ from + " to rod "+ to);
            return steps++;
        }
        toh(n-1, from, aux, to);
        System.out.println("move disk "+ n + " from rod "+ from + " to rod "+ to);
        toh(n-1,aux,to,from);
        return steps++;
    }
    public static void main(String[] args) {
        System.out.println("Steps: " + toh(2,1,3,2));
    }
}
