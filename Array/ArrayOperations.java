package Array;

public class ArrayOperations {
    static int arr[] = new int[10];
    static void printarray(int arr[]){
        for(int num: arr)
            System.out.print(num+", ");
        System.out.println();
    }

    static void insert(int arr[] ,int n,int cap,int pos, int value){
        if(n==cap){
            return;
        }
        for(int i=n-1;i>=pos-1;i--){
            arr[i+1] = arr[i];
        }
        printarray(arr);
        arr[pos-1] = value;
        n++;
        return;
    }

    static void delete(int arr[],int n,int pos){
        if(pos<1 || pos>=arr.length){
            System.out.println("Invalid Position");
            return;
        }
        for(int i=pos-1;i<n;i++){
            arr[i] = arr[i+1];
        }
        n--;
        return;
    }
    
    static int deleteByElement(int arr[] ,int n, int cap ,int x){
        int i;
        for(i=0;i<n;i++)
            if(arr[i]==x)
                break;
        if(i==n) return n;

        for(int j=i;j<n;j++){
            arr[j] = arr[j+1];
        }
        n = n-1;
        return n;
    }
    public static void main(String[] args) {
        

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println("Before inserting");
        printarray(arr);

        insert(arr, 3, arr.length, 3, 10);
        printarray(arr);

        // delete(arr, 4, 2);
        System.out.println(deleteByElement(arr, 4,arr.length,2));
        System.out.println(deleteByElement(arr, 4,arr.length,10));
        printarray(arr);

    }
}
