import java.util.Scanner;

public class DecodeString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
    }


    public static String Decode(String s){
         int count = 0;
         String ans = "";
         for(int i = 0 ; i<s.length() - 1 ; i++){
                      if(s.charAt(i) == '1'){
                          count++;
                      }else{
                         ans = ans + (char)('A' +count - 1 );
                      }
         }
         if(count > 0 ){
             ans = ans + (char)('A' + count - 1 );
         }
         return ans;
    }
}
