import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr.length;

        int[] hash = new int[n+1];
        for(int i=0; i<n-1; i++){
            hash[arr[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(hash[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
