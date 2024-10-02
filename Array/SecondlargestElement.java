package Array;

public class SecondlargestElement {
    static int secondLargestElement(int arr[]){
        int res = -1;
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                res = largest;
                largest=arr[i];
            }
            else if(arr[i]>res && arr[i]!=largest){
                res = arr[i]; 
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {11,8,11,10};
        int secondLargest = secondLargestElement(arr);
        System.out.println("secondLargest: " + secondLargest);
    }
}
