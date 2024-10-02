package Array;

public class SortedArrayOrNot {
    static boolean isSorted(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,34,5,6,7,8};
        System.out.println(isSorted(arr)? "Array is sorted" : "Array is not sorted");
    }
}
