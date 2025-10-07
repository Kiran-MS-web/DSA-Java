public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 3;
        RotateToLeft(arr, n, k);


        RotateToRight(arr, n, k);


    }


    static void RotateToRight(int[] arr, int n, int k) {
        k=k%n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);


        System.out.print("After Rotating the k elements to right ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
     static void RotateToLeft(int[] arr, int n, int k) {
        k=k%n;
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        reverse(arr, k , n - 1);
        // Reverse whole array
        reverse(arr, 0, n - 1);


         System.out.print("After Rotating the k elements to left ");
         for (int i = 0; i < n; i++)
             System.out.print(arr[i] + " ");
         System.out.println();
    }

    static void reverse(int[] arr , int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
