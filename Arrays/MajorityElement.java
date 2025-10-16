import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;  i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() > (arr.length)/2){
                System.out.println(it.getKey());
            }
        }
    }
}
