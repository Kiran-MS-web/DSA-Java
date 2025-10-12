import java.util.HashMap;

public class Subarray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int k =10;
        int len = getLongestSubarray1(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
    static int getLongestSubarray(int[] arr, int k){
        int left = 0;
        int right =0;
        int sum =arr[0];
        int len =0;
        int n = arr.length;

        while(right<n){

            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }
            if(sum == k) len = Math.max(len, right-left+1);
            right++;
            if(right<n) sum += arr[right];
        }
        return len;
    }

    static int getLongestSubarray1(int[] arr, int k){
        int n = arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();

        int sum=0;
        int len =0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum == k) len = Math.max(len,i+1);

            int rem = sum -k;
            if(map.containsKey(rem)){
                 int mlen = i - map.get(rem);
                len = Math.max(len, mlen);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return len;
    }
}
