import java.util.HashSet;

public class LongestSeq {
    static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        HashSet<Integer> s = new HashSet<>();
        for(int x : arr){
            s.add(x);
        }
        int longest = 0;
        for(int u : arr){
            if(!s.contains(u-1)){
                int curr = u;
                int count = 1;
                while(s.contains(curr + 1)){
                    curr++;
                    count++;
                }
                longest=Math.max(count,longest);
            }
        }
        System.out.println(longest);
    }
}
