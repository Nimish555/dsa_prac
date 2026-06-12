import java.util.Scanner;

public class countWord {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}
