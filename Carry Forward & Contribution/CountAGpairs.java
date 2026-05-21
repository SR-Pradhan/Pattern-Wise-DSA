public class CountAGpairs{
    public static void main(String[] args) {
        String str = "b c g a g a g";
        int count_g = 0, result = 0;

        int n = str.length();
        for(int i = n-1; i>=0; i--){
            if(str.charAt(i) == 'g') count_g++;
            else if(str.charAt(i) == 'a') result += count_g;
            else continue; 
        }
        System.out.println("Number of 'ag' pair = "+result);
    }
}