public class SecMax {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        System.out.println("Second smallest is " + secSmall(arr, n));
        System.out.println("Second largest is "+ secLargest(arr, n));
    }



    static int secLargest(int[] arr, int n){
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > large){
                sec_large = large;
                large= arr[i];
            }else if (arr[i] > sec_large && arr[i] != large){
                sec_large = arr[i];
            }
        }
        return sec_large;
    }




    static int secSmall(int[] arr, int n){
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < small){
                sec_small = small;
                small = arr[i];
            }else if (arr[i] < sec_small && arr[i] != small){
                sec_small = arr[i];
            }
        }
        return sec_small;
    }
}
