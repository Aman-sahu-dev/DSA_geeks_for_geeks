package Recursion;

public class PrintReverseOrderNo {
    static void printReverseOrder(int n){
        if(n<1) return;
        System.out.print(n+ " ");
        printReverseOrder(n-1);
    }
    public static void main(String[] args) {
        printReverseOrder(5);
    }
}
