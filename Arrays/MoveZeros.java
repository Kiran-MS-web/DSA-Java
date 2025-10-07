public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
         moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    static void moveZeros(int n, int[] arr){
       int i=0;
       for(int j=0; j<n; j++){
           if(arr[j] !=0 ){
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
               i++;
           }
       }
    }
}
//Two pointer method