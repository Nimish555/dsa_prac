import java.util.*;
public class groupAnagram {
    static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String , List<String>> map = new HashMap<>();
        for(String s : str){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key ,new  ArrayList<>());
            }
            map.get(key).add(s);
        }
        System.out.println(map.values());

    }
}
