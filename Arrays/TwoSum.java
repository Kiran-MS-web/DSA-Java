import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        HashMap <Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0; i<n; i++){
            int num = arr[i];
            int needed = target - num;
            if(map.containsKey(needed)){
                ans[0] = map.get(needed);
                ans[1] = i;
                System.out.println(Arrays.toString(ans));
            }
            map.put(arr[i],i);
        }


    }
}
