public class SumOfEvenIndexElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9, 4};
        int n  = arr.length;

        int[] prefixsum = new int[n];

        prefixsum[0] = arr[0];
        for(int i=1; i<n; i++){
            if(i%2==0){
                prefixsum[i] = prefixsum[i-1] + arr[i];
            }else{
                prefixsum[i] = prefixsum[i-1];
            }
        }

        int  L = 0, R = 4;
        int sum;
        if(L==0){
            sum = prefixsum[R];
        }else{
            sum = prefixsum[R] - prefixsum[L-1];
        }
        System.out.println("Sum from "+L+" index to "+" R index is = "+sum);
    }

    
}
