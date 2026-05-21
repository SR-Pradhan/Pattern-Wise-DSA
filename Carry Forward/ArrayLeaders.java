import java.util.*;

public class ArrayLeaders{
    static ArrayList<Integer> leaders(int[] arr){
        int n  = arr.length;

        ArrayList<Integer> list = new ArrayList<>();
        int leader = arr[n-1];
        list.add(leader);

        for(int i=n-2; i>=0; i--){
            if(arr[i] >= leader){
                leader = arr[i];
                list.add(leader);
            }
        }
        Collcetions.reverse(list);
        return list;
        
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }
}