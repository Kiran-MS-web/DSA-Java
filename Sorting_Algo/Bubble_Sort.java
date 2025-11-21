package Sorting_Algo;

import java.util.Arrays;


public class Bubble_Sort {
     static void main(String[] args) {

        int[] arr =  {2,5,1,3,0};
        int n = arr.length;

        //sorting
        for(int i=n-1; i>0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
    }
}