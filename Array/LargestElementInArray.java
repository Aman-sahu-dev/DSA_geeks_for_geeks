package Array;

public class LargestElementInArray {
    static int largestElement(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41};
        int largest = largestElement(arr);
        System.out.println("Largest element in array is: " + largest);
    }
}
