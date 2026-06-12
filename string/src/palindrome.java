import java.util.Scanner;

public class palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pal = "";
        for(int i = str.length() - 1 ; i>= 0 ; i--){
            pal = pal + str.charAt(i);
        }
        if(str.equals(pal)){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
    }

}
