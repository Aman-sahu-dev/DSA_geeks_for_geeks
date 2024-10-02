package Array;

public class RemoveDuplicates {
    static int removeDuplicates(int arr[]){
        int curr = 0;
        int size = 1;
        for(int i = 1; i < arr.length;i++){
            if(arr[i]!=arr[curr]) {
                curr++;
                size++;
            }
            else{
                
            }
        }
        return size;
    }
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4,5,5,6};
        System.out.println("Array :");
        printArray(arr);
    }
}
