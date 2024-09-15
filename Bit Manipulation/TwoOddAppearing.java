public class TwoOddAppearing {
    static void naiveTwoOddAppearing(int arr[] , int n){
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count%2!=0)
                System.out.print(arr[i]+" ");
        }

    }
    static void efficientTwoOddAppearing(int arr[], int n){
        int x = arr[0];
        for(int i=1; i<n; i++){
            x = x^arr[i];
        }
        int k = (x & ~(x-1));
        int res1 = 0, res2 = 0;

        for(int i=0; i<n; i++){
            if((arr[i]&k) != 0){
                res1 = res1 ^ arr[i];
            }
            else{
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println("The two odd numbers are: " + res1 + " and " + res2);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,4,4,6,7,7};
        int n = arr.length;
        System.out.println("Two odd numbers");
        naiveTwoOddAppearing(arr, n);
        efficientTwoOddAppearing(arr, n);
    }
}
