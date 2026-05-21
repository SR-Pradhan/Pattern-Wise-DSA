public class SumOfSumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int  k = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
            }
            k++;
            System.out.println("Sum of "+k+" Sub Array = "+sum);
        }
        
    }
    
}
