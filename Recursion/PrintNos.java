package Recursion;

public class PrintNos {
    static void printNos(int n){
        if(n<1) return;
        printNos(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        printNos(10);
    }
}
