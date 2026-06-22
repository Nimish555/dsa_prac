import java.util.*;

public class optTwoDigi {
    static void main(String[] args) {
        int[] arr = {4 , 5 , 6 ,8 ,9 , 7 , 12 ,3};
        int targ = 16;
        Map<Integer ,Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length ; i++){
            int left = targ - arr[i];
            if(map.containsKey(left)){
                System.out.println("index" + map.get(left) + "," + i);
                System.out.println("Values" + left + "," + arr[i]);
                return;
            }
            map.put(arr[i] , i);
        }
        System.out.println("No pair found");
    }
}
