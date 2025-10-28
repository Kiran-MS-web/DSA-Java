import java.util.ArrayList;

public class Leader {
    public static void main(String[] args) {
        int n = 6;
        int arr[]=  {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = optimal(arr, n);
        for (Integer an : ans) {
            System.out.println(an + " ");
        }
    }

    public static ArrayList<Integer> bruteForce(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<n; i++){
            boolean leader = true;
            for(int j=i+1; j<n; j++){
                if(arr[j]> arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader) ans.add(arr[i]);

        }
        return ans;
    }

    public static ArrayList<Integer> optimal(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        return ans;
    }

}
