public class LargestOddNum {
    static void main(String[] args) {
        String c = "42067";

        for(int i = c.length()-1 ; i>= 0 ; i--){
            char ch = c.charAt(i);
            if(ch== '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9'){
                System.out.println(c.substring(0 , i+1));
            }
        }
        System.out.println("");
    }
}
