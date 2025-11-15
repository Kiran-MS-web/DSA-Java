import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
//        Scanner sc = new Scanner();
//        int n;
//        System.out.println("Enter the size of array");
//        n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements ");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }

        int[] arr =  {2,5,1,3,0};
        int n = arr.length;

        //sorting
        for(int i=n-1; i>0; i--){
            for(int j=1; j<=i-1; j++){
                if(arr[j] >  arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}