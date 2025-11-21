package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
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
        for(int i =0 ; i<n-2; i++){
            int min = i;
            for(int j=1; j<n-1; j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
