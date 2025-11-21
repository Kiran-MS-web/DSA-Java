package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<=n-1; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
