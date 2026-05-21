public class RangeSum {
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,3};
        int n = arr.length;
        int[] prefixsum = new int[n];

        prefixsum[0] = arr[0];

        for(int i=1; i<n; i++){
            prefixsum[i] = prefixsum[i-1] + arr[i];
        }

        int L = 1, R = 3;
        int sum;
        if(L==0){
             sum = prefixsum[R];
        } else{
            sum = prefixsum[R] - prefixsum[L-1];
        } 
        System.out.println("Sum from "+L+" to "+R+" is = "+sum);
    }
    
}

//TC: O(n+1) = O(n), SC: O(n)

