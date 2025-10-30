import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Consecutive {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 7, 6};
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        int longest = 1;
        for(int it : set){
            if(!set.contains(it-1)) {
                int count = 1;
                int x = it;
                while(set.contains(x+1)){
                    count +=1;
                    x +=1;
                }
                longest = Math.max(longest,count);
            }

        }
        System.out.println(longest);
    }
}
