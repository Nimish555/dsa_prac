public class firstnoRepeating {
    static void main(String[] args) {
        String s = "geekforgeeks";
        int[]freeq = new int[256];
        for(int i = 0 ; i<s.length() ; i++){
            freeq[s.charAt(i)]++;
        }
        for(int i = 0 ; i<s.length() ; i++){
            if(freeq[s.charAt(i)] == 1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
