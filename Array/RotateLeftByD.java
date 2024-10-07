package Array;

public class RotateLeftByD {
    static int arr[] = {0,1,2,3,4,5,6};
    static void rotateByD(int arr[],int d){
        int temp[] = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i < arr.length; i++){
            arr[i-d] = arr[i];
        }
        for(int i = 0; i < d; i++){
            arr[arr.length-d+i] = temp[i];
        }
    }
    
    static void printArray(int arr[]){
        for(int num: arr)
            System.out.print(num+", ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(arr);
        rotateByD(arr, 2);        
        printArray(arr);
    }
}
