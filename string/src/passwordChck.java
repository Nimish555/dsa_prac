import java.util.Scanner;

public class passwordChck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        chck( str , n);
    }

    public static  int chck(String str , int n){
        if(n<4){
            return 0;
        }
         //pehla didgit intger to nhi
        if(Character.isDigit(str.charAt(0))){
            return 0;
        }
        boolean hasDigit = false;
        boolean hasCapital = false;

        for(int i = 0 ; i<n ; i++) {
            char ch = str.charAt(i);

            if (ch == ' ' || ch == '/'){
                return 0;
            }

            if(Character.isDigit(ch)){
                hasDigit=true;
            }
            if(Character.isUpperCase(ch)){
                hasCapital = true;
            }
        }
    }
}
