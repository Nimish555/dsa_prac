import java.util.*;
public class freeqCounbt {
    static void main(String[] args) {
        int[] arr = {1,1,1,2,3,5,9,87};
        int n = arr.length;
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int x : arr){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        System.out.println(mp);
    }
}
