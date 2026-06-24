public class longestComPrefix {
    static void main(String[] args) {
        String[] d = {"flower","flow","flight"};
        String prefix = d[0];
        for(int i = 1 ; i<d.length ; i++){
            while(!d[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }
}
