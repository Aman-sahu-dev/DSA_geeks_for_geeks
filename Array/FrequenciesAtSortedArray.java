package Array;

public class FrequenciesAtSortedArray {
    static int[] arr = {10,10,20,20,30,40,40,40};

    static void frequencyAtSortedArray(int arr[]){                                                                                                                                                      
        int count = 1;
        int currEelement = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == currEelement) 
            {
                count++;
            }
            else{
                System.out.println("Frequency of "+currEelement+" is "+count);
                currEelement = arr[i];
                count = 1;
            }
        }
        System.out.println("Frequency of "+currEelement+" is "+count); 
    }
    static void printArray(int[] arr){
        for(int num: arr)
            System.out.print(num+", ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(arr);
        frequencyAtSortedArray(arr);
    }
}
