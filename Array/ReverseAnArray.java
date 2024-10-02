package Array;

public class ReverseAnArray {
    static void printArray(int arr[]){
        for(int num: arr)
            System.out.print(num+", ");
        System.out.println();
    }
    static int[] reverse(int arr[]){
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array before sorting: ");
        printArray(arr);
        System.out.println("Array after sorting: ");
        printArray(reverse(arr));
    }
}
