public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,0,1};
        int cnt =0;
        int max =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 1){
                cnt++;
            }else{
                cnt=0;
            }
            max = Math.max(max,cnt);
        }
        System.out.println(max);
    }
}
