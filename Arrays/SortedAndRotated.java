public class SortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2};
        int n = arr.length;
        System.out.println(check(arr, n));
    }
    static boolean check(int[] arr, int n) {

        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
        if(count<=1){
            return true;
        }
        return false;

    }

}
