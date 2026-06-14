import java.util.Scanner;

public class countFirst {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freeq = new int[256];
        //freeq count
        for(int i = 0 ; i < str.length() ; i++){
              freeq[str.charAt(i)]++;
        }

        //first
        for(int i = 0 ; i<str.length() ; i++){
            if(freeq[str.charAt(i)] == 1){
                System.out.println(str.charAt(i));
                return;
            }
        }
        System.out.println("-1");
    }
}
