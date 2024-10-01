package Array;

import java.util.ArrayList;

public class ArrayBasic {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int arr2[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> arr3 = new ArrayList<Integer>();


        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);

        arr3.add(1);
        arr3.add(2);
        arr3.add(3);

        System.out.println(arr3);
    }
}
