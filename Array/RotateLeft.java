package Array;

public class RotateLeft {
    static int arr[];
    static void rotate(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
    static void printArray(int arr[]){
        for(int num: arr)
            System.out.print(num+", ");
        System.out.println();
    }
    public static void main(String[] args) {
        arr = new int[]{1,2,3,4,5,5,6,6,7};
        printArray(arr);
        rotate(arr);
        printArray(arr);
    }
}
