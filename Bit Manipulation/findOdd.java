public class findOdd {
    static int naiveFindOdd(int arr[] , int n){
        int res = arr[0];
        for(int i=0; i<n; i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count%2!=0)
                res = arr[i];
        }
        return res;
    }

    static int efficientFindOdd(int arr[], int n){
        int res = arr[0];
        for(int i=1; i<n; i++){
            res = res^arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,3,5,3,5,7};
        int n = arr.length;
        System.out.println("Odd number is: " + naiveFindOdd(arr, n));
        System.out.println("Odd number is: " + efficientFindOdd(arr, n));
    }
}
