public class FindMaxSumInK {
    public static int findmax(int[] nums, int k){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        //Brute Force, T.C: O(n^2), S.C: O(1)
        // for(int i=0; i<n-k; i++){
        //     int sum = 0;
        //     for(int j=i; j<i+k; j++){
        //         sum += nums[j];
        //         max = Math.max(max, sum);
        //     }
        // }

        //Optimized Approach, T.C: O(n), S.C: O(1)
        int i = 0, j;
        for(j=0; j<k; j++){
            sum += nums[j];
            max = Math.max(max, sum);
        }
        while(j<n){
            sum += nums[j]; //add the next element 
            sum = sum - nums[i]; //substract the ith element 
            i++; 
            j++;
            max = Math.max(max, sum);
        }
         return max;

    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2}; 
        System.out.println(findmax(arr, 3 ));    
    
    } 
}

