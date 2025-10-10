import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class SingleNum {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int n=arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int j : arr) {
            int value = mpp.getOrDefault(j, 0);
            mpp.put(j, value + 1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                System.out.println(it.getKey());
            }
        }
    }
}
