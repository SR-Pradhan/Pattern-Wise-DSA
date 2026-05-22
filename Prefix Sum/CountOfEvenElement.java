public class CountOfEvenElement{
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 3, 5};
        int n = arr.length;

        int[] marr = new int[n];

        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                marr[i] = 1;
            }else{
                marr[i] = 0;
            }
        }
        int[] psum = new int[n];
        psum[0] = marr[0];
        
        for(int i=1; i<n; i++){
            psum[i] = psum[i-1] + marr[i];
        }
        int L = 0, R = 3;
    
       System.out.println(psum[R]);
    }
}