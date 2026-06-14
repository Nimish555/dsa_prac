import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        if(s1.length() != s2.length()){
            System.out.println("false");
            return;
        }

        //freeq of string 1
        int[] freeq = new int[256];
        for(int i = 0 ; i<s1.length() ; i++){
            freeq[s1.charAt(i)]++;
        }

        //freeq of string 2
        for(int i = 0 ; i<s2.length(); i++){
            freeq[s2.charAt(i)]--;
        }

        for(int i =0 ; i<256 ; i++){
            if(freeq[i] != 0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");

    }
}
