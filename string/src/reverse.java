import java.util.Scanner;

public class reverse{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        for(int i = inp.length() - 1 ; i >= 0 ; i-- ){
            System.out.print(inp.charAt(i));
        }

    }
}