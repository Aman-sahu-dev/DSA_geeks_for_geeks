package Array;

public class LeadersInArray {
    static int arr[] = {7,10,4,3,45,5,2};
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void printLeaders(int arr[]) {
        int n = arr.length;
        int res = arr[n-1];
        System.out.print(res+ " ,");
        for(int i = n-2; i>=0; i--) {
            if(arr[i]>res){
                System.out.print(arr[i] + ", ");
                res = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        printArray(arr);
        printLeaders(arr);

    }
}
