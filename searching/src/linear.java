import java.util.Scanner;

public class linear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int targ = sc.nextInt();
        boolean found = false;
        for(int i = 0 ; i<n ; i++){
            if(arr[i] == targ){
                 found = true;
                break;
            }
        }
        if(found){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }

    }
}