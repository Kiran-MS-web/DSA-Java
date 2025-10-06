public class Max{
    public static void main() {
        int[] arr =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr));
    }
    static int findLargestElement(int[] arr) {
        int max= arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
